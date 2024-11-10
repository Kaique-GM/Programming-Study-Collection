import java.util.LinkedList;
import java.util.Queue;

public class Grafo_Matriz_Adjacencias {
    int[][] matrizAdjacencias;
    String[] vertices;
    int indiceVertices;
    boolean[] visitado;

    // Instancia a matriz conforme a quantidade de vertices.
    public Grafo_Matriz_Adjacencias(int qtdVertices) {
        this.matrizAdjacencias = new int[qtdVertices][qtdVertices];
        this.vertices = new String[qtdVertices];
        this.visitado = new boolean[qtdVertices];
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
        // Reseta os vértices visitados
        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
        }

        String caminho = "Inicio: " + iVerticeInicial;

        // Inicia a busca em profundidade
        return buscaProfundidadeAux(iVerticeInicial, iVerticeFinal, caminho);
    }

    // Função recursiva de busca em profundidade
    private String buscaProfundidadeAux(int verticeAtual, int iVerticeFinal, String caminho) {
        // Marca o vértice como visitado
        visitado[verticeAtual] = true;

        // Se o vértice atual é o final, retorna o caminho
        if (verticeAtual == iVerticeFinal) {
            return caminho + " ==> " + verticeAtual + " ==FIM==";
        }

        // Explora os vértices adjacentes
        for (int i = 0; i < vertices.length; i++) {
            if (matrizAdjacencias[verticeAtual][i] != 0 && !visitado[i]) {
                // Chama a função recursiva para o próximo vértice adjacente
                String resultado = buscaProfundidadeAux(i, iVerticeFinal, caminho + " ==> " + verticeAtual);
                if (!resultado.isEmpty()) {
                    return resultado; // Retorna o caminho se encontrado
                }
            }
        }
        // Caso o caminho não seja encontrado
        return "";
    }

    public String buscaLargura(int iVerticeInicial, int iVerticeFinal) {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(iVerticeInicial);
        visitado[iVerticeInicial] = true;

        int[] caminho = new int[vertices.length]; // Para reconstruir o caminho
        for (int i = 0; i < vertices.length; i++) {
            caminho[i] = -1; // -1 significa que não foi visitado
        }

        while (!fila.isEmpty()) {
            int verticeAtual = fila.poll();

            // Se encontramos o vértice final
            if (verticeAtual == iVerticeFinal) {
                StringBuilder caminhoPercorrido = new StringBuilder("Inicio: " + iVerticeInicial);
                while (verticeAtual != iVerticeInicial) {
                    caminhoPercorrido.insert(0, " ==> " + verticeAtual);
                    verticeAtual = caminho[verticeAtual];
                }
                caminhoPercorrido.insert(0, " ==> ");
                return caminhoPercorrido + " ==> " + iVerticeFinal + " ==FIM==";
            }

            // Explora os vizinhos
            for (int i = 0; i < vertices.length; i++) {
                if (matrizAdjacencias[verticeAtual][i] != 0 && !visitado[i]) {
                    fila.add(i);
                    visitado[i] = true;
                    caminho[i] = verticeAtual; // Armazena de onde veio
                }
            }
        }

        return "Caminho não encontrado.";
    }

    public String buscaGulosa(int iVerticeInicial, int iVerticeFinal) {
        return "";
    }

    public static void main(String[] args) {
        Grafo_Matriz_Adjacencias meuGrafo = new Grafo_Matriz_Adjacencias(4);
        meuGrafo.addArestaBidirecionais(0, 2, 10);
        meuGrafo.addArestaBidirecionais(0, 3, 5);
        meuGrafo.addArestaBidirecionais(0, 1, 2);
        meuGrafo.addArestaUnidirecionais(2, 3, 8);
        meuGrafo.addArestaUnidirecionais(3, 1, 7);
        System.out.println(meuGrafo.buscaProfundidade(3, 2));
        System.out.println(meuGrafo.buscaLargura(0, 3));
    }
}
