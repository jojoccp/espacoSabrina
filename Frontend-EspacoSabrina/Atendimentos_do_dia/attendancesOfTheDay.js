
const api_url = 'http://localhost:8080/attendance'

async function showAttendances() {
    const response = await fetch(api_url);
    const data = await response.json();
    console.log(data)

    var table = document.getElementById('table_body');
    
    data.forEach(function(elem, index) {
        let tr = document.createElement('tr')
        tr.innerHTML = `
        <tr>
        <th scope="row">${data[index].id_attendance}</th>
        <td>${data[index].client_name}</td>
        <td>${data[index].attendance_date}</td>
        <td>${data[index].procedure}</td>
        <td>${data[index].payment_type}</td>
        <td>${data[index].value}</td></tr>`
        table.appendChild(tr)
    });    
}

showAttendances()

// ------------------------------------------------------------------------------------------------

function callRightFunction() {
    let client_name = document.getElementById("client_name").value
    let attendance_date = document.getElementById("attendance_date").value

    console.log(client_name)
    console.log(attendance_date)

    if(client_name != "") {
        showAttendancesPerClient()
    } else if(attendance_date != "") {
        showAttendancesPerDate()
    }
}

async function showAttendancesPerClient() {
    let client_name = document.getElementById("client_name").value
    console.log(client_name)

    const response = await fetch(`http://localhost:8080/attendance/byClientName/${client_name}`);
    const data = await response.json();
    console.log(data)

    var table = document.getElementById('table_body');

    document.getElementById("table_body").innerHTML = "";
    
    data.forEach(function(elem, index) {
        let tr = document.createElement('tr')
        tr.innerHTML = `
        <tr>
        <th scope="row">${data[index].id_attendance}</th>
        <td>${data[index].client_name}</td>
        <td>${data[index].attendance_date}</td>
        <td>${data[index].procedure}</td>
        <td>${data[index].payment_type}</td>
        <td>${data[index].value}</td></tr>`
        table.appendChild(tr)
    });    
}

// ------------------------------------------------------------------------------------------------

async function showAttendancesPerDate() {
    let attendance_date = document.getElementById("attendance_date").value
    console.log(attendance_date)

    const response = await fetch(`http://localhost:8080/attendance/byAttendanceDate/${attendance_date}`);
    const data = await response.json();
    console.log(data)

    var table = document.getElementById('table_body');

    document.getElementById("table_body").innerHTML = "";
    
    data.forEach(function(elem, index) {
        let tr = document.createElement('tr')
        tr.innerHTML = `
        <tr>
        <th scope="row">${data[index].id_attendance}</th>
        <td>${data[index].client_name}</td>
        <td>${data[index].attendance_date}</td>
        <td>${data[index].procedure}</td>
        <td>${data[index].payment_type}</td>
        <td>${data[index].value}</td></tr>`
        table.appendChild(tr)
    });    
}