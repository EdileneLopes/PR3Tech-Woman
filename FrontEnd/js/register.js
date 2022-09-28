//verificar url api.cliente
const register = async () => {
    const rawResponse = await fetch('http://3.89.93.225:8080/clientes', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            "nome": document.getElementById("nome").value, 
            "cpf": document.getElementById("cpf").value, 
            "email": document.getElementById("email").value, 
            "password": document.getElementById("password").value, 
        })
    });
    const content = await rawResponse.json();

    console.log(content);
};


