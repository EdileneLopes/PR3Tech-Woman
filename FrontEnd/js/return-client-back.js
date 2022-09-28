const carregar = async () => {
    const rawResponse = await fetch('http://localhost:5500/cliente', {
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
                <td>${cliente.idCLiente}</td>
                <td>${cliente.nome}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.email}</td>
            </tr>
        `
    });

    document.getElementById("table-content").innerHTML = html;
};


carregar();