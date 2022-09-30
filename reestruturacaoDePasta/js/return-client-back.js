const clientes = async () => {
    const rawResponse = await fetch('http://3.89.93.225/clientes', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const cliente = await rawResponse.json();


    let html = ""
    cliente.forEach(cliente => {
        html += `
            <tr>
                <td>${cliente.idCliente}</td>
                <td>${cliente.nome}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.email}</td>
            </tr>
        `
    });

    document.getElementById("table-content").innerHTML = html;
};

clientes();