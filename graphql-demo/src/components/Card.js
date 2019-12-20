import React from 'react';
import ClayCard from '@clayui/card';
import ClayButton from '@clayui/button';

class Card extends React.Component {

    constructor(props) {

        super(props);

        this.state = this.getInitialState();

    }

    getInitialState = () => {
        return {};
    }

    shouldComponentUpdate = () => {
        return false;
    }

    render = () => {

        const {logo, title, description, onClick} = this.props;

        return (

            <ClayCard horizontal>
                <ClayCard.Row>
                    <div className='autofit-col'>
                        <img
                            alt='thumbnail'
                            className='card-item-first'
                            src={logo}
                            style={{ width: '200px' }}
                        />
                    </div>
                    <div className='autofit-col autofit-col-expand autofit-col-gutters'>
                        <section className='autofit-section'>
                            <ClayCard.Description displayType='title'>
                                {title}
                            </ClayCard.Description>
                            <ClayCard.Description truncate={false} displayType='text'>
                                {description}
                            </ClayCard.Description>
                            <ClayButton displayType='primary' onClick={onClick}>Request</ClayButton>
                        </section>
                    </div>
                </ClayCard.Row>
            </ClayCard>

        );

    }

}

export default Card;