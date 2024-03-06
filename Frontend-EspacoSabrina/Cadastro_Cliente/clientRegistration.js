
const api_url = 'http://localhost:8080/clients'

async function showClients() {
    const response = await fetch(api_url);
    const data = await response.json();
    console.log(data)

    var table = document.getElementById('table_body');
    
    data.forEach(function(elem, index) {
        let tr = document.createElement('tr')
        tr.innerHTML = `
        <tr>
        <th class="d-flex justify-content-center" scope="row">${data[index].id_client}</th>
        <td>${data[index].client_name}</td>
        <td>${data[index].client_cellphone}</td>
        </tr>`
        table.appendChild(tr)
    });    
}

showClients()

// -----------------------------------------------------------

function sendData() {

    let client_name = document.getElementById("client_name").value
    let client_cellphone = document.getElementById("client_cellphone").value


    fetch("http://localhost:8080/clients", {
        method: "POST",

        body: JSON.stringify({
            client_name: `${client_name}`,
            client_cellphone: `${client_cellphone}`
        }),

        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    }).then( console.log("Cliente criado com sucesso!"))

}