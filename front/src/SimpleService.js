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
        var data = this.simpleData();
        return (
            <div> 
                <p> id: { data.id }</p>
                <p> age: { data.age }</p>
                <p> city: { data.city }</p>
                <p> experience: { data.experience }</p>
                <p> technologies: { data.technologies }</p>
                <p> salary net: { data.salaryNet } </p>
            </div>
        )
    }
}

export default SimpleService;