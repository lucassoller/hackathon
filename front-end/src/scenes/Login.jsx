import React, { Component, Fragment } from 'react'
import { Input, Form } from '../components/index'

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
      this.userService.salvarToken(response.data.token)
      this.setState({
        logged: true
      })
    })
  }


  render() {
    return (
      <Fragment>
        <Form titulo = 'Login' descricaoBotaoEnviar='Logar'>
          <Input descricao="Email" />
          <Input descricao="Senha" />
        </Form>
    </Fragment>
    )
  }
}
