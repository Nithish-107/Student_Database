function table1(){

    fetch("http://localhost:8080/students")
    .then((response)=> response.json())
    .then((student)=>{
        const stutable=document.getElementById("tb")

        student.forEach(student =>{
            var row=`<tr>
            <td>${student.rollno}</td>
            <td>${student.name}</td>
            <td>${student.dept}</td>
            </tr>`
            stutable.innerHTML+=row;
        });
    });
}

