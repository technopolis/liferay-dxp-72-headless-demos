import React from 'react';
import GraphQL from './GraphQL';
import OpenApi from './OpenApi';

class App extends React.Component {

    render = () => {

        return (
            <React.Fragment>
                <link rel="stylesheet" type="text/css" charset="UTF-8" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.css" />
                <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick-theme.min.css" />
                <div className='container'>
                    <div className='row'>
                        <div className='col-xs-12 col-sm-12'>
                            <h1 className='my-5'>Liferay Headless</h1>
                            <p>One of the main benefits of GraphQL is to make APIs less chatty. ... In other words, RESTful API calls are chained on the client before the final representation can be formed for display. GraphQL can reduce this by enabling the server to aggregate the data for the client in a single query.</p>
                        </div>
                    </div>
                    <div className='row'>
                        <div className='col-xs-12 col-sm-6'>
                            <GraphQL />
                        </div>
                        <div className='col-xs-12 col-sm-6'>
                            <OpenApi />
                        </div>
                    </div>
                </div>
            </React.Fragment>
        )

    }

}

export default App;