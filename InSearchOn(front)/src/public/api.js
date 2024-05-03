// Seleciona o campo de entrada
let result = ""

const inputPesquisa = document.getElementById("input-pesquisa");
const p = document.getElementById("test");

// Adiciona um ouvinte de evento para o evento keypress
async function busca() {

  console.log("entrou")

  const valorInput = inputPesquisa.value;  
  const response = await fetch("https://localhost:8080/v1/search?query=" + valorInput);
  const body = await response.json();
  result = body;
   p.innerText = result;        
  
}
