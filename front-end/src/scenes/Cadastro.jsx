import React, { Component, Fragment } from 'react'
import { Input, Form } from '../components/index'
import CadastrarUsuarioService from '../services/cadastrar.usuario.service'

export default class Cadastro extends Component {

  constructor(){
    super();

    this.state = {
      nomeCompleto: '',
      email: '',
      senha: '',
      imagem: '',
      telefone: '',
      confirmaSenha: '',
  }

  }

  handleChange = (event) => {
    const target = event.target
    const name = target.name
    const value = target.value
    this.setState({ [name]: value })
}

  render() {
    return (
      <Fragment>
          <Form titulo = 'Cadastro' descricaoBotaoEnviar = 'Cadastrar'>
          <Input descricao="Nome" />
          <Input descricao="Senha" />
          <Input descricao="Confirmar senha   " />
          <Input descricao="Email" />
          <Input descricao="Telefone" />
        </Form>
    </Fragment>
    )
  }
}
