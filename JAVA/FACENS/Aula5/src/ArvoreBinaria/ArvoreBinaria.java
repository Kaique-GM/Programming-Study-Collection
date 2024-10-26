public class ArvoreBinaria {

    private NoArvoreBinaria raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adicionar(int info) {
        if (raiz == null) {
            raiz = new NoArvoreBinaria(info, null, null);
        } else {
            adicionarRecursivo(info, raiz);
        }
    }

    private void adicionarRecursivo(int info, NoArvoreBinaria raiz) {
        NoArvoreBinaria novoNo;

        if (info > Integer.parseInt(raiz.getInfo().toString())) {
            if (raiz.getNoDireita() == null) {
                novoNo = new NoArvoreBinaria(info, null, null);
                raiz.setNoDireita(novoNo);
            } else {
                adicionarRecursivo(info, raiz.getNoDireita());
            }
        }
        if (info < Integer.parseInt(raiz.getInfo().toString())) {
            if (raiz.getNoEsquerda() == null) {
                novoNo = new NoArvoreBinaria(info, null, null);
                raiz.setNoEsquerda(novoNo);

            } else {
                adicionarRecursivo(info, raiz.getNoEsquerda());
            }
        }
    }

    public Integer buscarProfundidade(int info) {
        return buscarProfundidadeRecursivo(raiz, info, 0);
    }

    private Integer buscarProfundidadeRecursivo(NoArvoreBinaria raiz, int info, int profundidade) {
        if (raiz == null) {
            return -1;
        }
        if (Integer.parseInt(raiz.getInfo().toString()) == info) {
            return profundidade;
        }
        if (info < Integer.parseInt(raiz.getInfo().toString())) {
            return buscarProfundidadeRecursivo(raiz.getNoEsquerda(), info, profundidade + 1);
        } else {
            return buscarProfundidadeRecursivo(raiz.getNoDireita(), info, profundidade + 1);
        }
    }

    public void printArvore() {
        if (raiz != null) {
            printArvoreRecursivo(raiz, 0);

        } else {
            System.out.println("A árvore está vazia!");
        }

    }

    private void printArvoreRecursivo(NoArvoreBinaria no, int profundidade) {

        if (no != null) {
            System.out.println("Profundidade: " + profundidade + ", info: " + no.getInfo());

            printArvoreRecursivo(no.getNoEsquerda(), profundidade + 1);

            printArvoreRecursivo(no.getNoDireita(), profundidade + 1);
        }

    }

    public void preOrdem(NoArvoreBinaria no) {
        if (no != null) {
            System.err.println(no.getInfo());

            preOrdem(no.getNoEsquerda());

            preOrdem(no.getNoDireita());

        }
    }

    public void emOrdem(NoArvoreBinaria no) {
        if (no != null) {

            preOrdem(no.getNoEsquerda());

            System.err.println(no.getInfo());

            preOrdem(no.getNoDireita());

        }
    }

    public void posOrdem(NoArvoreBinaria no) {
        if (no != null) {

            preOrdem(no.getNoEsquerda());

            preOrdem(no.getNoDireita());

            System.err.println(no.getInfo());

        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(8);
        arvore.adicionar(1);
        arvore.adicionar(2);
        arvore.adicionar(4);
        arvore.adicionar(7);
        arvore.adicionar(6);
        arvore.adicionar(9);
        // Imprime a árvore em ordem
        arvore.emOrdem(arvore.raiz);
    }
}
