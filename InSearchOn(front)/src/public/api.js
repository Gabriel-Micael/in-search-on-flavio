var inputPesquisa = document.getElementById("input-pesquisa");
const resultSearch = document.getElementById("result");
var from = 1

inputPesquisa.addEventListener("keypress", function (event) {
    // Verifica se a tecla pressionada é a tecla "Enter" (código 13)
    if (event.key === "Enter") {
        event.preventDefault(); // Evita o envio do formulário
        busca(); // Chama a função busca()
    }
});

// Função para realizar a busca
function busca() {
    console.log("entrou");

    const valorInput = inputPesquisa.value;
    fetch("http://localhost:8080/v1/search?query=" + valorInput, {
        method: "GET",
        headers: {
            "Content-Type": "text/json"
        },
    })
        .then(function (response) {
            return response.json();
        })
        .then(function (jsonData) {
            const formattedData = formatJSON(jsonData);
            resultSearch.innerHTML = formattedData;
            // Verifica se a div está vazia
            if (resultSearch.innerHTML.trim() === "") {
                resultSearch.style.display = "none"; // Se estiver vazia, oculta a div
            } else {
                resultSearch.style.display = "block"; // Se não estiver vazia, exibe a div
            }
        })
        .catch(function (error) {
            console.error('Erro:', error);
        });
}

// Função para formatar os dados JSON
function formatJSON(jsonData) {
    return jsonData.map(item => {
        return `
                    <div>
                        <div style="max-width:250px;">
                            <a href="${item.url}">
                                <h2>${item.title}</h2>
                                <p class="url" style="font-size: 12px;">${item.url}</p>
                            <a>
                        </div>
                        <br>
                        <p class="abs" style="font-size: 16px;">${item.abs}</p>
                    </div>
                `;
        // `
        // <table>
        //     <tr>
        //         <th> ${item.title} </th>
        //     </tr>
        //     <tr>
        //         <td>
        //             <a href="${item.url}" class="url" style="font-size: 12px;">${item.url}</a>
        //         </td>
        //     </tr>
        //     <tr>
        //         <p class="abs" style="font-size: 16px;">${item.abs}</p>
        //     </tr>
        // </table>
        // `;
    }).join(''); // Precisa juntar todos os elementos do array em uma string
}

document.addEventListener('DOMContentLoaded', function() {
    var result = document.getElementById('result');
  
    // Função para verificar se há conteúdo
    function checkContent() {
      if (result.innerHTML.trim() === '') {
        result.classList.add('empty');
      } else {
        result.classList.remove('empty');
      }
    }
  
    // Verificar conteúdo ao carregar a página
    checkContent();
  
    // Verificar conteúdo sempre que for modificado
    result.addEventListener('DOMSubtreeModified', checkContent);
  });
  


