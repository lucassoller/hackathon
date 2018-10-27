import React, { Component, Fragment } from 'react'
import { Input, Form } from '../components/index'

export default class Login extends Component {
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
