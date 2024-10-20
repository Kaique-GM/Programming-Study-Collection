
public class NodeCircular {
    
    private Object info;//Armazena as informações que serão atribuidas a lista
    private NodeCircular proximoNo;//Aponta para o próximo Nó
    private NodeCircular anteriorNo;

    public NodeCircular(Object info, NodeCircular proximoNo, NodeCircular anteriorNo) {
        this.info = info;
        this.proximoNo = proximoNo;
        this.anteriorNo = anteriorNo;

    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodeCircular getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NodeCircular proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NodeCircular getAnteriorNo() {
        return anteriorNo;
    }

    public void setAnteriorNo(NodeCircular anteriorNo) {
        this.anteriorNo = anteriorNo;
    }

    
    
}
