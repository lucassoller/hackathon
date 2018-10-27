import React, { Component } from 'react';
import './App.css';
import {Input, Form} from './components/index'
import Sessao from './components/sessao/Sessao'

class App extends Component {
  render() {
    return (
      <div className='App'>
      {/* <Form>
        <Input descricao = "Aqui vai um input" />
      </Form> */}
      <Sessao titulo='Perfil' nomeBotao='Editar'/>
      </div>
    );
  }
}

export default App;
