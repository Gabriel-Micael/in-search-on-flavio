const inputPesquisa = document.getElementById("input-pesquisa");

        // Função para realizar a busca
        function busca() {
            console.log("entrou");

            const valorInput = inputPesquisa.value;  
            fetch("http://localhost:8080/v1/search?query=" + valorInput, {
                method: "GET",
                headers: {
                    "Content-Type": "text/plain"
                },
            })
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                const formattedData = formatJSON(jsonData);
                document.getElementById('test').innerHTML = formattedData;
            })
            .catch(function(error) {
                console.error('Erro:', error);
            });
        }

        // Função para formatar os dados JSON
        function formatJSON(jsonData) {
            return jsonData.map(item => {
                return `
                    <div>
                        <h2>${item.title}</h2>
                        <p class="url" style="font-size: 12px;">${item.url}</p>
                        <br>
                        <p class="abs" style="font-size: 16px;">${item.abs}</p>
                    </div>
                `;
            }).join(''); // Precisa juntar todos os elementos do array em uma string
        }