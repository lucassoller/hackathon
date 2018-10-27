import React, { Component,Fragment } from 'react'
import Map from '../components/mapa/Map'
import DescricaoHome from '../components/descricao_home/DescricaoHome';
export default class Home extends Component {
    render() {
        return (
            <Fragment>
                <DescricaoHome />

                <Map />
            </Fragment>
        )
    }
}
