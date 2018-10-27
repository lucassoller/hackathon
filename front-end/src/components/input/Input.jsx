import React, { Component, Fragment } from 'react'
import './Input.css'

export default class Input extends Component {


  constructor() {
    super()

    this.state = {
        inputVazio: false
    }
}

validaInput = (event) => {
    if (event.target.value === '') {
        this.setState({ inputVazio: true })
    } else {
        this.setState({ inputVazio: false })
    }
}

renderAvisoInputVazio() {
    if (this.state.inputVazio) {
        return <span className='aviso-input'>Campo obrigatório</span>
    } else {
        return null
    }
}
  render() {
    return (
      <Fragment>
        <input className="input-form" type="text" placeholder = {this.props.descricao} onBlur={this.validaInput}/>
        {this.renderAvisoInputVazio()}
        </Fragment>
    )
  }
}
