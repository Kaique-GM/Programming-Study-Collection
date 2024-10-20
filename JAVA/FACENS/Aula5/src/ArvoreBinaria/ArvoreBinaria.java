public class ArvoreBinaria {

    private NoArvoreBinaria raiz;

    public ArvoreBinaria(){
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

    private Integer buscarProfundidadeRecursivo(NoArvoreBinaria raiz,int info, int profundidade){
        if(raiz == null){
            return -1;
        }
        if(Integer.parseInt(raiz.getInfo().toString()) == info){
            return profundidade;
        }
        if(info < Integer.parseInt(raiz.getInfo().toString())){
            return buscarProfundidadeRecursivo(raiz.getNoEsquerda(), info, profundidade + 1);
        }else{
            return buscarProfundidadeRecursivo(raiz.getNoDireita(), info, profundidade + 1);
        }
    }

    public void printArvore(){
        if(raiz != null){
         printArvoreRecursivo(raiz, 0);

        }else{
            System.out.println("A árvore está vazia!");
        }

    }

    private void printArvoreRecursivo(NoArvoreBinaria no, int profundidade){
        
        if(no != null){
            System.out.println("Profundidade: " + profundidade + ", info: " + no.getInfo());
            
            printArvoreRecursivo(no.getNoEsquerda(), profundidade + 1);

            printArvoreRecursivo(no.getNoDireita(), profundidade + 1);
        }
        

    }

}
