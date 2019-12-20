import React from 'react';
import { openapi } from '../lib/services';
import { parse } from '../lib/utils';
import Card from './Card';
import Carousel from '../components/Carousel';
import Preview from '../components/Preview';

import openapiLogo from '../images/openapi-logo.png';

const url = 'https://liferay72.open.gr/o/headless-delivery/v1.0/content-sets/35019/content-set-elements';

class OpenApi extends React.Component {

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

        return openapi.getContentSetElements(35019);

    }

    onClick = (evt) => {

        this.setState({ slides: [], raw: null }, () => {

            this.request().then((res) => {

                const slides = parse(res);

                console.log('OpenApi:', slides);

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
                            logo={openapiLogo}
                            title={'OpenApi'}
                            description={'The OpenAPI Specification, originally known as the Swagger Specification, is a specification for machine-readable interface files for describing, producing, consuming, and visualizing RESTful web services.'}
                            onClick={this.onClick}
                        />
                    </div>
                </div>
                <div className='row'>
                    <div className='col-12'>
                        <Preview title='Request' data={url} />
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

export default OpenApi;