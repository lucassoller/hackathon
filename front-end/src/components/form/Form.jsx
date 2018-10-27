import React, { Component } from 'react'
import './Form.css'

export default class Form extends Component {

  render() {
    return (
      <form className='form' onSubmit={this.props.onSubmit}>
      <h1>{this.props.titulo}</h1>
            {this.props.children}
      <input className='botao-enviar' type="submit" value={this.props.descricaoBotaoEnviar}/>
      </form>
    )
  }
}
