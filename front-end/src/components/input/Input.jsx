import React, { Component } from 'react'
import './Input.css'

export default class Input extends Component {
  render() {
    return (
        <input className="input-form" type="text" placeholder = {this.props.descricao}/>
    )
  }
}
