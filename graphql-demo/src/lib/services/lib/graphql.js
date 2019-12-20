import {SERVER, AUTHORIZATION} from '../../config';

const SERVER_GRAPHQL_ENDPOINT = `${SERVER}/o/graphql`;

function request(query) {
    return fetch(getURL(SERVER_GRAPHQL_ENDPOINT), {
        body: `{"query": "${query}"}`,
        headers: {
            Authorization: AUTHORIZATION,
            'Content-Type': 'text/plain; charset=utf-8',
        },
        method: 'POST'
    }).then(response => response.json()).then(json => {
        if (json.errors) return Promise.reject(json.errors);

        const data = json.data;

        return data[Object.keys(data)[0]];
    })
}

function getURL(path, params = {
    p_auth: ''
}) {
    const uri = new URL(path);

    const keys = Object.keys(params);

    keys.forEach(key => uri.searchParams.set(key, params[key]));

    return uri.toString();
}

function escape(x) {
    return x !== undefined && JSON.stringify(x).replace(/[\\]/g, '\\\\')
        .replace(/[/]/g, '\\/')
        .replace(/[\b]/g, '\\b')
        .replace(/[\f]/g, '\\f')
        .replace(/[\n]/g, '\\n')
        .replace(/[\r]/g, '\\r')
        .replace(/[\t]/g, '\\t');
}

function gql(strings, ...values) {
    return strings.map((string, i) => string + (escape(values[i]) || ''))
        .join('')
        .replace(/\s+/g, ' ')
        .replace(/"/g, '\\"');
}

export const getContentSetElements = (contentSetId, page = 1, pageSize = 10) => {
    return request(gql `
    query {
        contentSetContentSetElements(contentSetId: ${contentSetId}, page: ${page}, pageSize: ${pageSize}) {
          items {
            contentType
            content {
              ... on StructuredContent {
                title
                id
                uuid
                description
                contentFields {
                  name
                  dataType
                  label
                  value {
                    data
                    image {
                      contentUrl
                    }
                  }
                }
                dateCreated
                dateModified
                datePublished
                availableLanguages
              }
            }
          }
          page
          pageSize
          totalCount
        }
      }      
    `);
}