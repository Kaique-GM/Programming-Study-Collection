import java.util.LinkedList;
import java.util.Queue;

public class Grafo_Matriz_Adjacencias {
    int[][] matrizAdjacencias;
    String[] vertices;
    int indiceVertices;
    boolean[] visitado; // Para marcar os vértices visitados
    String caminho = "";
    int[] predecessor;

    // Instancia a matriz conforme a quantidade de vertices.
    public Grafo_Matriz_Adjacencias(int qtdVertices) {
        this.matrizAdjacencias = new int[qtdVertices][qtdVertices];
        this.vertices = new String[qtdVertices];
        this.visitado = new boolean[qtdVertices];
        this.predecessor = new int[qtdVertices];
        indiceVertices = 0;
    }

    // Método para criar um novo vertice
    public void addVertice(String nome) {
        if (indiceVertices < vertices.length) {
            vertices[indiceVertices] = nome;
            indiceVertices++;
        }
    }

    // Método para remover o último vertice
    public void removeVertice() {
        if (indiceVertices > 0) {
            vertices[indiceVertices - 1] = "";
            indiceVertices--;
        }
    }
    // Método para adicionar as relações (bidirecionais) entre dois vertices do
    // grafo.

    public void addArestaBidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencias[iVerticeA][iVerticeB] = valor;
        matrizAdjacencias[iVerticeB][iVerticeA] = valor;
    }

    // Método para adicionar a relação unidirecional entre o Vertice A para o
    // vertice B

    public void addArestaUnidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencias[iVerticeA][iVerticeB] = valor;
    }

    // Retorna as relações do vertice indicado pelo indice iVertice
    public String relacoesVertices(int iVertice) {
        String relacoes = "";
        for (int i = 0; i < vertices.length; i++) {
            relacoes += "\n Vertice: " + i + "=>";
            for (int j = 0; j < vertices.length; j++) {
                if (matrizAdjacencias[i][j] != 0) {
                    relacoes = relacoes + " Vertice " + j
                            + "(" + matrizAdjacencias[i][j] + ")";
                }
            }
        }
        return relacoes;
    }

    /*
     * === Implementar o método buscaProfundidade(iVerticeInicial, iVerticeFinal)
     * === que irá buscar em profundidade até encontrar o Vertice Final
     * === retornando uma String com o caminho percorrido
     * Exemplo: Vertice Inicial 0 => 2 => 3 => 1 ==FIM==
     */

    // Método para implementar a busca em profundidade
    public String buscaProfundidade(int iVerticeInicial, int iVerticeFinal) {
        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
        }

        if (iVerticeInicial == iVerticeFinal) {
            return caminho = "O vértice inicial é igual ao vértice Final";
        }
        // Inicia a busca em profundidade
        caminho = "Inicio: ";
        buscaProfundidadeRecursivo(iVerticeInicial, iVerticeFinal);
        return caminho;
    }

    public void buscaProfundidadeRecursivo(int iVertice, int iVerticeFinal) {

        // Se o vértice já foi visitado
        if (visitado[iVertice]) {
            return;
        }

        // Marca o vértice atual como visitado
        visitado[iVertice] = true;

        // Verifica se o vértice atual é o vértice final
        if (iVertice == iVerticeFinal) {
            caminho += iVertice + " ==FIM=="; // Caminho encontrado
            return;
        }

        // Adiciona o vértice ao caminho
        caminho += iVertice + " ==> ";

        // Explora os vizinhos do vértice atual
        for (int i = 0; i < vertices.length; i++) {
            // Se existe uma aresta e o vértice não foi visitado, explora
            if (matrizAdjacencias[iVertice][i] != 0 && !visitado[i]) {
                buscaProfundidadeRecursivo(i, iVerticeFinal);
                // Se o caminho já foi encontrado, termina a busca
                if (caminho.contains("==FIM==")) {
                    return;
                }
            }
        }
    }

    public String buscaLargura(int iVerticeInicial, int iVerticeFinal) {
        // Reseta os arrays de visitados e predecessores
        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
            predecessor[i] = -1; // -1 significa que o vértice não tem predecessor
        }

        // Cria uma fila para a busca
        Queue<Integer> fila = new LinkedList<>();
        fila.add(iVerticeInicial);
        visitado[iVerticeInicial] = true;

        while (!fila.isEmpty()) {
            int verticeAtual = fila.poll();

            // Se encontrou o vértice final
            if (verticeAtual == iVerticeFinal) {
                return reconstruaCaminho(iVerticeInicial, iVerticeFinal);
            }

            // Explore todos os vizinhos do vértice atual
            for (int i = 0; i < vertices.length; i++) {
                if (matrizAdjacencias[verticeAtual][i] != 0 && !visitado[i]) {
                    fila.add(i);
                    visitado[i] = true;
                    predecessor[i] = verticeAtual; // Armazena o predecessor
                }
            }
        }
        return "Caminho não encontrado."; // Caso não encontre o caminho
    }

    private String reconstruaCaminho(int iVerticeInicial, int iVerticeFinal) {
        int vertice = iVerticeFinal;
        StringBuilder caminhoReverso = new StringBuilder();

        // Reconstrói o caminho a partir do vértice final
        while (vertice != iVerticeInicial) {
            caminhoReverso.insert(0, " => " + vertice);
            vertice = predecessor[vertice];
        }

        caminhoReverso.insert(0, iVerticeInicial);
        caminho = "Caminho: " + caminhoReverso.toString();
        return caminho;
    }

    public String buscaGulosa(int iVerticeInicial, int iVerticeFinal) {
        // Reseta os arrays de visitados e o caminho
        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
        }
        caminho = "Inicio: ";

        // Define o vértice atual como o vértice inicial
        int verticeAtual = iVerticeInicial;
        visitado[verticeAtual] = true;

        while (verticeAtual != iVerticeFinal) {
            caminho += verticeAtual + " => ";
            int menorPeso = Integer.MAX_VALUE;
            int proximoVertice = -1;

            // Encontra o vizinho não visitado com a aresta de menor peso
            for (int i = 0; i < vertices.length; i++) {
                if (matrizAdjacencias[verticeAtual][i] != 0 && !visitado[i]) {
                    if (matrizAdjacencias[verticeAtual][i] < menorPeso) {
                        menorPeso = matrizAdjacencias[verticeAtual][i];
                        proximoVertice = i;
                    }
                }
            }

            // Verifica se encontrou um próximo vértice
            if (proximoVertice == -1) {
                return caminho + "Caminho não encontrado. Nenhum próximo vértice acessível.";
            }

            // Atualiza o vértice atual e marca como visitado
            verticeAtual = proximoVertice;
            visitado[verticeAtual] = true;
        }

        // Adiciona o vértice final ao caminho
        caminho += iVerticeFinal + " ==FIM==";
        return caminho;
    }

    public static void main(String[] args) {
        Grafo_Matriz_Adjacencias meuGrafo = new Grafo_Matriz_Adjacencias(4);
        meuGrafo.addArestaBidirecionais(0, 2, 10);
        meuGrafo.addArestaBidirecionais(0, 3, 5);
        meuGrafo.addArestaBidirecionais(0, 1, 2);
        meuGrafo.addArestaUnidirecionais(2, 3, 8);
        meuGrafo.addArestaUnidirecionais(3, 1, 7);

        meuGrafo.addArestaBidirecionais(1, 2, 3);

        System.out.println("Relacoes de Vértices:");
        System.out.println(meuGrafo.relacoesVertices(0));

        System.out.println("\nBusca em Profundidade:");
        System.out.println(meuGrafo.buscaProfundidade(0, 3));

        System.out.println("\nBusca em Largura:");
        System.out.println(meuGrafo.buscaLargura(0, 3));

        System.out.println("\nBusca Gulosa:");
        System.out.println(meuGrafo.buscaGulosa(0, 3));
    }
}
