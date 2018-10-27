import React, { Component } from 'react';
import './App.css';
import {Cadastro, Login} from './scenes/index'

class App extends Component {
  render() {
    return (
      <div className='App'>
          <Cadastro />
      </div>
    );
  }
}

export default App;
