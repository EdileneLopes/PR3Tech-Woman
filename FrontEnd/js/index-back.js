const carregar = async () => {
    const rawResponse = await fetch('http://3.89.93.225/pacote', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const pacote = await rawResponse.json();

    let html
    let img 
    pacote.forEach(pacote => {

    img = `
        <img class="box-fotos" src="${pacote.linkFoto}" alt="" srcset="">
    `

    html = `
    <h3>${pacote.destino}</h3>
    <br>
    <br>
    <h2>R$<span>${pacote.preco}</span></h2>
    <br>
    <br>
    <p>Check in:<span>${pacote.data_checkin}</span></p>
    <br>
    <p>Check out:<span>${pacote.data_checkout}</span></p>
    <br>
    <br>
    <p>Diárias disponíveis:<span>${pacote.qtde_diarias}</span></p>
        `
    

    });
    document.getElementsByClassName("box-fotos").innerHTML = img;
    document.getElementsById("description-card").innerHTML = html;
};


carregar();