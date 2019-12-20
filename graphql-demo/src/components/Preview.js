import React from 'react';
import ClayPanel from '@clayui/panel';
import JSONPretty from 'react-json-pretty';
import monikai from  'react-json-pretty/dist/monikai';

class Preview extends React.Component {

    constructor(props) {

        super(props);

        this.state = this.getInitialState();

    }

    getInitialState = () => {
        return {};
    }

    render = () => {

        const { title, data } = this.props;

        if (title && data) {

            return (

                <ClayPanel
                    collapsable
                    displayTitle={title}
                    displayType='secondary'
                    showCollapseIcon={false}
                >
                    <ClayPanel.Body>
                        <JSONPretty data={data} theme={monikai}></JSONPretty>
                    </ClayPanel.Body>
                </ClayPanel>

            )

        }

        return null;

    }

}

export default Preview;