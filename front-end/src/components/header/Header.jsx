import React, { Component } from 'react'
import './Header.css'

export default class Header extends Component {
  render() {
    return (
      <div className="header">
        <h2 className="logo"><a href="#">EstouEmPerigo</a></h2>
        <ul className="lista-menu">
            <li className="item-menu"><a  className="item-menu-a" href="">Editar perfil</a></li>
            <li className="item-menu">|</li>
            <li className="item-menu"><a className="item-menu-a" href="/cadastro">Cadastrar-se</a></li>
            <li className="item-menu"><a className="item-menu-a" href="/login">Entrar</a></li>
        </ul>
      </div>
    )
  }
}
