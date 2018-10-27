import React, { Component } from 'react'
import './FotoForm.css'

export default class FotoForm extends Component {
  render() {
    return (
    <div className='foto-form'>
        <img src={this.props.imagemUrl} />
    </div>
    )
  }
}
