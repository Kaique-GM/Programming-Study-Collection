
public class TesteListaLigada {
    
    public static void main(String[] args){
        
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.adicionar("Rodrigo");
        minhaLista.adicionar("Pedro");
        minhaLista.adicionar("Carlos");
        minhaLista.adicionar("Creusa");
        
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }
        minhaLista.adicionar("Rafael", 2);
        
        System.out.println(" ========================");
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }
        /* ==== Para Entregar na prÃ³xima aula. =====
        Altere a mÃ©todo Adicionar para permitir adicionar no Ã­ndice 0;
        Implemente o mÃ©todo void remover(int posiÃ§Ã£o);
        Que remove o nÃ³ definido pela posiÃ§Ã£o da lista        
        =============================================================*/
        
        System.out.println(" ========================");
        minhaLista.remover(2);

        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }

        System.out.println(" ========================");
        minhaLista.adicionar("Joaquim", 0);
        
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - "+minhaLista.getLista(i));
        }
    }
    
}
