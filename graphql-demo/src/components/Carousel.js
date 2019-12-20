import React from 'react';
import Slider from 'react-slick';
import ClayLoadingIndicator from '@clayui/loading-indicator';

import { SERVER } from '../../src/lib/config';

class Carousel extends React.Component {

    constructor(props) {

        super(props);

        this.state = this.getInitialState();

    }

    getInitialState = () => {
        return {
            showLoader: false,
            settings: {
                speed: 500,
                autoplay: true,
                infinite: true,
                dots: true
            }
        }
    }

    UNSAFE_componentWillUpdate = (nextProps, nextState) => {

        const { showLoader } = this.state;

        if (!showLoader) {
            this.setState({
                showLoader: true
            });
        }

    }

    renderCarousel = (slides) => {

        const { settings } = this.state;

        return (
            <div className='main-carousel'>
                <Slider {...settings}>
                    {slides.map((slide, idx) => {
                        return (
                            <div key={idx} className='slick-slide-container'>
                                <div className='p-3'>
                                    <h3>{slide.Title}</h3>
                                    <p>{slide.Description}</p>
                                </div>
                                <img src={`${SERVER}${slide.BgImage}`} alt='slide'/>
                            </div>
                        )
                    })}
                </Slider>
            </div>
        );

    }

    renderLoader = () => {

        return (
            <div className='p-5 m-5'>
                <ClayLoadingIndicator />
            </div>
        )

    }

    render = () => {

        const { slides } = this.props;
        const { showLoader } = this.state;

        if (slides.length) {
            return this.renderCarousel(slides);
        }

        if (showLoader) {
            return this.renderLoader();
        }

        return null;

    }

}

export default Carousel;