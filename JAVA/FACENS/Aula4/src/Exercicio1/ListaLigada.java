public class ListaLigada {
    private Node inicio;
    private Node fim;
    private int tamanho;

    // Criando um construtor para permitir instanciar
    // uma lista ligada vazia.
    public ListaLigada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionar(Object info) {
        // Adiciona um novo Nó na ultima posição da lista ligada.
        Node novoNo;
        if (tamanho == 0) {
            // Criando o primeiro Nó que aponta para null
            novoNo = new Node(info, null);
            // Atribui o ponteiro inicio e fim para o primeiro Nó
            inicio = fim = novoNo;
            tamanho++;// Incrementa tamanho
        } else {
            novoNo = new Node(info, null);
            // Atribui o ponteiro do ultimo Nó para o NovoNó
            // fim é somente um ponteiro....
            fim.setProximoNo(novoNo);
            // Atribui o ponteiro fim para o NovoNo
            fim = novoNo;
            // Incrementa tamanho
            tamanho++;
        }
    }

    public void adicionar(Object info, int indice) {
        // Adiciona na posição definida pelo índice.
        Node aux, anterior;
        Node novoNo;

        if (indice == 0) {
            novoNo = new Node(info, inicio);

            inicio = novoNo;

            tamanho++;
        }

        else if (indice < tamanho) {
            // Retorna o Nó definido pelo indice
            aux = percorreLista(indice);
            novoNo = new Node(info, aux);
            anterior = percorreLista(indice - 1);
            anterior.setProximoNo(novoNo);
            tamanho++;
        }

    }

    public void remover(int indice) {
        if (indice == 0) {
            inicio = inicio.getProximoNo();
        } else {

            Node anterior = percorreLista(indice - 1);

            Node nodoRemover = anterior.getProximoNo();

            anterior.setProximoNo(nodoRemover.getProximoNo());

            if (nodoRemover == fim) {
                fim = anterior;
            }
        }

        tamanho--;
    }

    public Object getLista(int indice) {
        // Retornará o info do nó apontado pelo índice
        return percorreLista(indice).getInfo();
    }

    private Node percorreLista(int indice) {
        // Percorre a lista ligada e retorna o node referente ao índice
        Node aux = inicio;// Atribui o primeiro Nó a aux
        if (indice <= tamanho) {// verifica se o índice é válido
            for (int i = 0; i < indice; i++) {
                // Percorre a lista até a posição indicada pelo índice
                aux = aux.getProximoNo();
            }
            return aux;
        } else
            return null;
    }

    public int getTamanho() {
        // Retorna o tamanho da lista
        return tamanho;
    }

}
