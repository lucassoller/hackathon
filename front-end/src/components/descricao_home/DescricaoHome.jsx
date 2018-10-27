import React, { Component } from 'react'
import './DescricaoHome.css'
export default class DescricaoHome extends Component {
  render() {
    return (
        <div className="page-description">{this.props.children}</div>
    )
  }
}
