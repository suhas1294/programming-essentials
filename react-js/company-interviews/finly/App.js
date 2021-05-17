// https://codesandbox.io/s/sweet-banzai-xgs5p

import React, { Component } from "react";
import "./styles.css";
import Modal from "./Modal";

class App extends Component {
    state = {
        showModal: false
    };

    // modalCloseHandler = () => {
    //   this.setState({ showModal: false });
    // };

    render() {
        let classNames = ["App"];
        if (this.state.showModal) {
            classNames.push("bg-blur");
        }
        return ( <
            React.Fragment >
            <
            div className = { classNames.join(" ") } >
            <
            h1 > Hello CodeSandbox < /h1> <
            h2 > Start editing to see some magic happen! < /h2> <
            button onClick = {
                () => this.setState({ showModal: !this.state.showModal })
            } >
            Modal Open <
            /button> < /
            div > <
            Modal modalHeading = "This is the heading"
            show = { this.state.showModal }
            content = "hello world" /
            >
            <
            /React.Fragment>
        );
    }
}

export default App;