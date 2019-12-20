import React from 'react';
import { graphql } from '../lib/services';
import { parse } from '../lib/utils';
import Card from './Card';
import Carousel from '../components/Carousel';
import Preview from '../components/Preview';

import graphqlLogo from '../images/graphql-logo.png';

const query = `
query {
    contentSetContentSetElements(contentSetId: {contentSetId}, page: {page}, pageSize: {pageSize}) {
      items {
        contentType
        content {
          ... on StructuredContent {
            id
            title
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
`;

class GraphQL extends React.Component {

    constructor(props) {

        super(props);

        this.state = this.getInitialState();

    }

    getInitialState = () => {
        return {
            raw: null,
            slides: []
        };
    }


    request = () => {

        return graphql.getContentSetElements(35019);

    }

    onClick = (evt) => {

        this.setState({ slides: [], raw: null }, () => {

            this.request().then((res) => {

                const slides = parse(res);

                console.log('GraphQL:', slides);

                this.setState({
                    slides: slides,
                    raw: res
                });

            }).catch(console.error);

        });

    }

    render = () => {

        const { slides, raw } = this.state;

        return (

            <React.Fragment>
                <div className='row'>
                    <div className='col-12'>
                        <Card
                            logo={graphqlLogo}
                            title={'QraphQL'}
                            description={'GraphQL is an open-source data query and manipulation language for APIs, and a runtime for fulfilling queries with existing data.'}
                            onClick={this.onClick}
                        />
                    </div>
                </div>
                <div className='row'>
                    <div className='col-12'>
                        <Preview title='Request' data={query} />
                    </div>
                </div>           
                <div className='row'>
                    <div className='col-12'>
                        <Preview title='Response' data={raw} />
                    </div>
                </div>                          
                <div className='row'>
                    <div className='col-12'>
                        <Carousel slides={slides}></Carousel>
                    </div>
                </div>           
            </React.Fragment>

        )

    }

}

export default GraphQL;