import React, { Component } from 'react'
import './Sessao.css'

export default class Sessao extends Component {
  render() {
    return (
        <div className="sessao">
        <div className="div-sessao">
            <h3 className="titulo-sessao">{this.props.titulo}</h3>
            <button className="botao-sessao">{this.props.nomeBotao}</button>
        </div>
     </div>
    )
  }
}
