import React from 'react';

class SimpleService extends React.Component {

    simpleData() {
        return {
            id: 1,
            age: 24,
            city: "Wrocław",
            experience: 1,
            technologies: [
                "java",
                "spring",
                "git"
            ],
            salaryNet: 4000
        }
    } 

    render() {
        return (
            <div> 
                <p> id: { this.simpleData().id }</p>
                <p> age: { this.simpleData().age }</p>
                <p> city: { this.simpleData().city }</p>
                <p> experience: { this.simpleData().experience }</p>
                <p> technologies: { this.simpleData().technologies }</p>
                <p> salary net: { this.simpleData().salaryNet } </p>
            </div>
        )
    }
}

export default SimpleService;