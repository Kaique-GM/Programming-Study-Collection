
public class ListaCircular {
    private NodeCircular inicio;
    private NodeCircular fim;
    private int tamanho;

    public ListaCircular() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionar(Object info) {
        NodeCircular novoNo = new NodeCircular(info, null, null);
        if (tamanho == 0) {
            inicio = novoNo;
            fim = novoNo;

            inicio.setProximoNo(inicio);
            inicio.setAnteriorNo(inicio);
            tamanho++;
        } else {
            inicio.setAnteriorNo(fim);
            fim.setProximoNo(inicio);

            fim.setProximoNo(novoNo);
            inicio.setAnteriorNo(novoNo);

            fim = novoNo;
            tamanho++;
        }
    }

    public void adicionar(Object info, int indice) {
        NodeCircular novoNo = new NodeCircular(info, null, null);

        if (indice == 0) {
            if (tamanho == 0) {
                inicio = novoNo;
                fim = novoNo;
                inicio.setProximoNo(inicio);
                inicio.setAnteriorNo(inicio);
            } else {
                novoNo.setProximoNo(inicio);
                fim.setProximoNo(novoNo);
                inicio.setAnteriorNo(novoNo);
                novoNo.setAnteriorNo(fim);
                inicio = novoNo;
            }
            tamanho++;
            return;
        }

        if (indice > 0 && indice <= tamanho) {
            NodeCircular aux = percorreLista(indice);
            if (aux != null) {
                novoNo.setProximoNo(aux);
                NodeCircular temp = inicio;

                for (int i = 0; i < indice - 1; i++) {
                    temp = temp.getProximoNo();
                }

                temp.setProximoNo(novoNo);
                aux.setAnteriorNo(novoNo);
            }

            tamanho++;
        }
    }

    public void remover(int indice) {
        if (indice == 0) {
            inicio = inicio.getProximoNo();
            inicio.setAnteriorNo(fim);
            fim.setProximoNo(inicio);

        } else {

            NodeCircular anterior = percorreLista(indice - 1);

            NodeCircular nodoRemover = anterior.getProximoNo();

            if (nodoRemover == fim) {
                fim = anterior;
                fim.setProximoNo(inicio);
                inicio.setAnteriorNo(fim);

            } else {

                nodoRemover.getProximoNo().setAnteriorNo(anterior);
                anterior.setProximoNo(nodoRemover.getProximoNo());

            }
        }

        tamanho--;
    }

    public Object getListaCircular(int indice) {
        return percorreLista(indice).getInfo();
    }

    private NodeCircular percorreLista(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }
        NodeCircular aux = inicio;

        for (int i = 0; i < indice; i++) {
            aux = aux.getProximoNo();
        }
        return aux;
    }
    
    public int getTamanho() {
        return tamanho;
    }

}
