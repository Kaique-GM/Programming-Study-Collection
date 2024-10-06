public class Node {
    
    private Object info;//Armazena as informações que serão atribuidas a lista
    private Node proximoNo;//Aponta para o próximo Nó

    public Node(Object info, Node proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }
    public Object getInfo() {
        return info;
    }
    public Node getProximoNo() {
        return proximoNo;
    }
    public void setInfo(Object info) {
        this.info = info;
    }
    public void setProximoNo(Node no) {
        this.proximoNo = no;
    }
    
    
    
}
