import {
    SERVER,
    AUTHORIZATION
} from '../../config';

const SERVER_REST_ENDPOINT = `${SERVER}/o/headless-delivery/v1.0`;

function request(url, method, params, body) {
    return fetch(getURL(url, params), {
        body: JSON.stringify(body),
        headers: {
            Authorization: AUTHORIZATION,
            'Content-Type': 'application/json'
        },
        method: method || 'GET'
    }).then(response => {
        if (response.status === 204) {
            return true;
        }

        return response.json();
    });
}

function getURL(path, params = {}) {
    const uri = new URL(path);

    const keys = Object.keys(params);

    keys.forEach(key => uri.searchParams.set(key, params[key]));

    return uri.toString();
}

export const getContentSetElements = (contentSetId) => {
    return request(`${SERVER_REST_ENDPOINT}/content-sets/${contentSetId}/content-set-elements`);
}