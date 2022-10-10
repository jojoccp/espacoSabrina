
const api_url = 'http://localhost:8080/clients'

async function getApi() {
    const response = await fetch(api_url);
    const data = await response.json();
    console.log(data)
}

getApi()