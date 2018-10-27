import React, { Component } from 'react';
import './App.css';
import { Route } from 'react-router-dom'
import {Cadastro, Login, Home} from './scenes/index'
import Header from './components/header/Header';

class App extends Component {
  render() {
    return (
      <div className='App'>
        <Header/>
        <Route component={Home} path="/" exact/>
        <Route component={Login} path="/login" />
        <Route component={Cadastro} path="/cadastro" />
      </div>
    );
  }
}

export default App;
