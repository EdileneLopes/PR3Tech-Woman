
const register = async () => {
    const rawResponse = await fetch('http://3.89.93.225/clientes', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            "nome": document.getElementById("nome").value, 
            "cpf": document.getElementById("cpf").value, 
            "email": document.getElementById("email").value, 
            "senha": document.getElementById("password").value, 
        })
    });
    const content = await rawResponse.json();

    console.log(content);

    clientes();
};


