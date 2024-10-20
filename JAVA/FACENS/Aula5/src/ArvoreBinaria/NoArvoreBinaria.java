public class NoArvoreBinaria {

    private Object info;
    private NoArvoreBinaria NoDireita;
    private NoArvoreBinaria NoEsquerda;

    public NoArvoreBinaria(Object info, NoArvoreBinaria noEsquerda, NoArvoreBinaria noDireita) {
        this.info = info;
        NoDireita = noDireita;
        NoEsquerda = noEsquerda;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NoArvoreBinaria getNoDireita() {
        return NoDireita;
    }

    public void setNoDireita(NoArvoreBinaria noDireita) {
        NoDireita = noDireita;
    }

    public NoArvoreBinaria getNoEsquerda() {
        return NoEsquerda;
    }

    public void setNoEsquerda(NoArvoreBinaria noEsquerda) {
        NoEsquerda = noEsquerda;
    }

}
