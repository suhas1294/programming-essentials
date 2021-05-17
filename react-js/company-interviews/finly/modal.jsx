// write a reusable modal component
// solution: using react-portal

import React, { Component } from "react";
import "./modal-style.css";

class Modal extends Component {
    state = {
        show: true
    };

    modalCloseHandler = () => {
        this.setState({ show: true });
        document.getElementById("modal-container").classList.remove("no-display");
    };

    render() {
        let mainContent = null;

        let classNames = ["modal-content"];
        if (!this.state.show) {
            classNames.push("no-display");
        }

        console.log(classNames);
        if (this.props.show) {
            mainContent = (
              <div id = "modal-container"
                className = { classNames.join(" ") } > { /* header */ }
                <div className = "modalHeader" >
                <div > { this.props.modalHeading } </div>
              <div >
                <button onClick = {
                    () => this.setState({ show: false }) } > X
                 </button>
                 </div>
               </div>
               <hr / >

                { /* main content */ }
                <div > { this.props.content } </div>

                { /* footer of component */ } <div > </div> </div>
            );
        } else {
            mainContent = <div > </div>;
        }
        return mainContent;
    }
}

export default Modal;