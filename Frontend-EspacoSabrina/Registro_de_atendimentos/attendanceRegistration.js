

function sendData() {

    let client_name = document.getElementById("client_name").value
    let value = document.getElementById("value").value
    let attendance_date = document.getElementById("attendance_date").value
    let procedure = document.getElementById("procedure").value
    let payment_type = document.getElementById("payment_type").value


    fetch("http://localhost:8080/attendance", {
        method: "POST",

        body: JSON.stringify({
            procedure: `${procedure}`,
            value: `${value}`,
            attendance_date: `${attendance_date}`,
            payment_type: `${payment_type}`,
            client_name: `${client_name}`
        }),

        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    }).then( console.log("Procedimento criado com sucesso!"))

}



