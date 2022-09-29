
const register = async () => {
    const rawResponse = await fetch('http://3.89.93.225/clientes/cadastrar', {
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

   carregar();

   const carregar = async () => {
    const rawResponse = await fetch('http://3.89.93.225/clientes', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const clientes = await rawResponse.json();

    let html = ""
    clientes.forEach(cliente => {
        html += `
            <div>
                <div>${cliente.nome}</div>
                <div>${cliente.email}</div>
                <div>${cliente.cpf}</div>
    
            </div> 
        `
       
    });

    document.getElementById("conteudoTabela").innerHTML = html;
};
 

carregar();
};


