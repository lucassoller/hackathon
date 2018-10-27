import React, { Component } from 'react';
import './App.css';
import { Route } from 'react-router-dom'
import {Cadastro, Login} from './scenes/index'

class App extends Component {
  render() {
    return (
      <div className='App'>
        <Route component={Home} path="/" exact/>
        <Route component={Login} path="/login" />
        <Route component={Cadastro} path="/cadastro" />
          <Login />
      </div>
    );
  }
}

export default App;
