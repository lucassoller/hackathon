import React, { Component, Fragment } from 'react'
import { Input, Form } from '../components/index'
import UserService from '../services/user.service'

export default class Login extends Component {

  constructor() {
    super()
    this.state = {
      email: '',
      senha: '',
      logged: false
    }
  }

  componentDidMount() {
    this.userService = new UserService()
    // if (this.userService.getToken()) {
    //   this.setState({ logged: true })
    // }
  }

  handleChange = (event) => {
    const target = event.target
    const name = target.name
    this.setState({
      [name]: target.value
    })
  }

  onSubmit = (event) => {
    event.preventDefault()

    this.userService.login(this.state.email, this.state.senha).then((response) => {
      alert('uhu')
      this.userService.salvarToken(response.data.token)
      this.setState({
        logged: true
      })
    })
  }


  render() {
    return (
      <Fragment>
        <Form titulo = 'Login' descricaoBotaoEnviar='Logar' onSubmit = {this.onSubmit}>
          <Input descricao="Email"
          nome = 'email'
          onChange = {this.handleChange}
          />
          <Input descricao="Senha"
          nome =  'senha'
          onChange = {this.handleChange}
          />           
        </Form>
    </Fragment>
    )
  }
}
