const pacotes = async () => {
    const rawResponse = await fetch('http://3.89.93.225/pacotes', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const produtos = await rawResponse.json();


    let div = ""
    produtos.forEach(produto => {
        div= `
        <h3>${produto.nome}</h3>
            <br>
            <br>
            <h2>R$ <span>${produto.preco}</span></h2>
           
            <p>Diárias disponíveis:<span>${produto.qtde_diarias}</span></p>
            <br>
            <br>
        `
    });

    document.getElementById("description-card1").innerHTML =div;
};

pacotes();