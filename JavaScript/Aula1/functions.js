// Manipulção dos Objetos DOM (Document Object Model)
// Representação de dados dos objetos que compõem uma estrutura
// e o conteúdo de um documento web

//Essencial para manipular e interagir com elementos de uma página
// document.querySelector;

// Exemplo
const titulo = document.querySelector('h1');
titulo.textContent = 'Texto Modificado >:)'; // Modifica o texto do elemento

// Uso Pricipal: Buscar e modificar elementos HTML

// document.createElement();

// Cria novos elementos dinamicamente

// Exemplo

const novoElemento = document.createElement('p');
novoElemento.textContent = 'Parágrafo adicionado';
document.body.appendChild(novoElemento);

// Uso Principal: Adicionar novos elementos ao DOM

// addEventListener()
// Funções que lidam com interações dos usuários
// Sua Função é adicionar um ouvinte para eventos (Como Cliques)

const botao = document.querySelector('button');
botao.addEventListener('click', () => {
    alert('Botão clicado!');
});

// Uso Principal: Criar interatividade, como cloques ou movimentos do mouse

// setTimeout()
// controlam ações que ocorrem em intervalos ou após um
// Executa uma função após um periodo de tempo (Unidade de medida > Milissegundos)

setTimeout(() => {
    alert('Executado após 2 segundos');
}, 2000);

// Alert > ele executa o toString do seu objeto e apresenta em tela
// console.log > ele registra a informação no console do navegador dicanfo restrita ao conhecimento do desenvolvedor
// Uso Principal: Atrasar execuções ou cirar temporizadores
