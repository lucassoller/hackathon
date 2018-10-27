import React, { Component } from 'react';
import './App.css';
import { Route } from 'react-router-dom'
import {Cadastro, Login, Home} from './scenes/index'
import Home from './scenes/Home';

class App extends Component {
  render() {
    return (
      <div className='App'>
        <Route component={Home} path="/" exact/>
        <Route component={Login} path="/login" />
        <Route component={Cadastro} path="/cadastro" />
      </div>
    );
  }
}

export default App;
