import React, { Component } from 'react';
import './App.css';
import { Input, Form } from './components/index'
import Sessao from './components/sessao/Sessao'

class App extends Component {
  render() {
    return (
      <div className='App'>
        <Form titulo = 'Cadastro'>
          <Input descricao="Nome" />
          <Input descricao="Senha" />
          <Input descricao="Confirmar senha   " />
          <Input descricao="Email" />
          <Input descricao="Telefone" />
        </Form>
        {/* <Sessao titulo='Perfil' nomeBotao='Editar'/> */}
      </div>
    );
  }
}

export default App;
