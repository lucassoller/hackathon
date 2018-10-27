import React, { Component, Fragment } from 'react'
import { Input, Form, FotoForm, BotaoContato } from '../components/index'
import UserService from '../services/user.service'

export default class Cadastro extends Component {

  constructor() {
    super();

    this.state = {
      nomeCompleto: '',
      email: '',
      senha: '',
      imagem: '',
      telefone: '',
      mostrarCadastrarContato: false
    }
    this.userService = new UserService();
  }

  handleChange = (event) => {
    const target = event.target
    const name = target.name
    const value = target.value
    this.setState({ [name]: value })
  }

  onClickChangeStatusMostrarCadastroContato = () => {
    this.setState({mostrarCadastrarContato: !this.state.mostrarCadastrarContato})
  }

  limparDadosState() {
    this.setState({
      nomeCompleto: '',
      email: '',
      senha: '',
      imagem: '',
      telefone: ''
    })
  }

  onSubmitRegistraDados = (event) => {
    event.preventDefault()
    this.userService.registrar(this.state.nomeCompleto,
       this.state.email,
       this.state.senha,
       this.state.imagem,
       this.state.telefone).then((response) => {
    }).catch((err) => {

    })
  }

  render() {
    return (
      <Fragment>
        <Form titulo='Cadastro' descricaoBotaoEnviar='Cadastrar'
        descricaoBotaoContato = 'Criar contato'
        onSubmit = {this.onSubmitRegistraDados}>
          <FotoForm 
          imagemUrl = {this.state.imagem}
          />
          <Input descricao="Imagem"
          nome = 'imagem'
          onChange = {this.handleChange}
          />
          <Input descricao="Nome"
          nome = 'nomeCompleto'
          onChange = {this.handleChange}
          />
          <Input descricao="Senha"
          nome = 'senha'
          onChange = {this.handleChange}
          />
          <Input descricao="Confirmar senha"
          />
          <Input descricao="Email"
          nome = 'email'
          onChange = {this.handleChange}
          />
          <Input descricao="Telefone"
          nome = 'telefone'
          onChange = {this.handleChange}
          />
          <BotaoContato/>
        </Form>
      </Fragment>
    )
  }
}
