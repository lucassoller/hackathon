import React, { Component, Fragment } from 'react'
import './Map.css'
import GoogleMapReact from 'google-map-react';

const MapPointer = ({ text }) => (
    <div style={{
        color: 'white', 
        fontWeight: 'bold',
        background: 'rgba(255, 0, 0,0.5)',
        display: 'inline-flex',
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: '100%',
        transform: 'translate(-50%, -50%)',
        width: '100px',
        height: '100px'

      }}>
        {text}
      </div>
  );

export default class Map extends Component {

    componentDidMount() {
        this.actualPosition()
    }


    constructor(props) {
        super()
        this.state = {
            lat: 59.95,
            lng: 30.33
        }
    }

    actualPosition = () => {
        navigator.geolocation.getCurrentPosition(position => {
            this.setState({
                lat: position.coords.latitude,
                lng: position.coords.longitude
            })
        })
    }



    render() {
        return (
            <div className="map-container">
                <GoogleMapReact
                    bootstrapURLKeys={{ key: 'AIzaSyCymW1VwK90lGRjoMD4xqNN8KgIE_RPOzU' }}
                    defaultCenter={{lat: this.state.lat, lng: this.state.lng}}
                    defaultZoom={14}
                >
                    <MapPointer
                        lat={this.state.lat}
                        lng={this.state.lng}
                        text={'AJUDE-ME!'}
                    />
                </GoogleMapReact>
            </div>
        )
    }
}

