var openModalButton = document.getElementById("openModalButton");
var modal = document.getElementById("myModal");
var modalItem = document.getElementById("modalItem");
var closeModalButtonItem = document.getElementById("closeModalButtonItem");

var closeModalButton = document.getElementById("closeModalButton");
openModalButton.addEventListener("click", function () {
    modal.style.display = "block";
});

closeModalButton.addEventListener("click", function () {
    modal.style.display = "none";
});


function cadastrarNovoAnimal(data) {
    // URL do endpoint para cadastro de animais
    const url = 'http://localhost:8080/animal';

    // Opções da solicitação POST
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    };

    // Enviar a solicitação
    fetch(url, options)
        .then((response) => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Erro ao cadastrar o animal');
            }
        })
        .then((animal) => {
            console.log('Animal cadastrado com sucesso:', animal);
            // Faça algo com os dados do animal, se necessário
        })
        .catch((error) => {
            console.error('Erro ao cadastrar o animal:', error);
            // Trate o erro adequadamente, se necessário
        });
}

// Exemplo de uso
// Adicione um evento de clique ao botão "Confirmar"
document.getElementById("confirmButton").addEventListener("click", function () {
    console.log("Ola")
    // Coletar os dados dos campos de input
    const nome = document.getElementById("nome").value;
    const especie = document.getElementById("especie").value;
    const descricao = document.getElementById("descricao").value;
    const idade = document.getElementById("idade").value;
    const cor = document.getElementById("cor").value;
    const linkFoto = document.getElementById("linkFoto").value;
    const cidade = document.getElementById("cidade").value;

    // Criar o objeto novoAnimalData com os dados coletados
    const novoAnimalData = {
        nome: nome,
        especie: especie,
        descricao: descricao,
        idade: idade,
        cor: cor,
        linkFoto: linkFoto,
        cidade: cidade
    };
    cadastrarNovoAnimal(novoAnimalData)
    modal.style.display = "none";
    console.log("Dados do novo animal:", novoAnimalData);


});

function fazerRequisicaoGet() {
    const url = "http://localhost:8080/animal"; // Substitua com a URL do seu servidor e endpoint

    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json", // Você pode ajustar o tipo de conteúdo conforme necessário
        },
    })
        .then((response) => {
            if (!response.ok) {
                throw new Error(`Erro na requisição: ${response.status} - ${response.statusText}`);
            }
            return response.json(); // Supondo que a resposta é um JSON
        })
        .then((data) => {
            // Manipule os dados da resposta aqui
            console.log(data);
            renderizaCards(data); // Move the function call here
        })
        .catch((error) => {
            // Lida com erros
            console.error(error);
        });
}


async function renderizaCards(data) {
    const lista = document.querySelector(".listadeanimais");
    data.forEach(element => {

        const foto = document.createElement("img")
        const card = document.createElement("li")
        const nome = document.createElement("h3")
        const especie = document.createElement("h4")
        const button = document.createElement("button")


        foto.setAttribute("src", element.linkFoto)

        nome.textContent = element.nome
        especie.textContent = element.especie
        button.textContent = "Ver mais"

        card.append(foto, nome, especie, button)
        lista.appendChild(card)


        button.addEventListener("click", function () {
            console.log("Ola")
            modalItem.style.display = "block";


            const nomeItem = document.querySelector(".nomeDoAnimal");
            nomeItem.textContent = element.nome

            const especieItem = document.querySelector(".especieDoAnimal");
            especieItem.textContent = element.especie

            const descricaoItem = document.querySelector(".descricaoDoAnimal");
            descricaoItem.textContent = element.descricao

            const idadeItem = document.querySelector(".idadeDoAnimal");
            idadeItem.textContent = element.idade

            const corItem = document.querySelector(".corDoAnimal");
            corItem.textContent = element.cor



            const cidadeItem = document.querySelector(".cidadeDoAnimal");
            cidadeItem.textContent = element.cidade



        })


        closeModalButtonItem.addEventListener("click", function () {
            modalItem.style.display = "none";
        });





    });

}
fazerRequisicaoGet(); // Call the function here instead of assigning it to a variable