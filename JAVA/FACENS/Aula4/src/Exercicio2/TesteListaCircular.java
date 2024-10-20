
public class TesteListaCircular {

    public static void main(String[] args) {

        ListaCircular minhaListaCircular = new ListaCircular();
        minhaListaCircular.adicionar("Rodrigo");
        minhaListaCircular.adicionar("Pedro");
        minhaListaCircular.adicionar("Carlos");
        minhaListaCircular.adicionar("Creusa");

        for (int i = 0; i < minhaListaCircular.getTamanho(); i++) {
            System.out.println(i + " - " + minhaListaCircular.getListaCircular(i));
        }

        System.out.println(" ========================");

        minhaListaCircular.adicionar("Rafael", 2);

        for (int i = 0; i < minhaListaCircular.getTamanho(); i++) {
            System.out.println(i + " - " + minhaListaCircular.getListaCircular(i));
        }

        System.out.println(" ========================");
        minhaListaCircular.remover(2);

        for (int i = 0; i < minhaListaCircular.getTamanho(); i++) {
            System.out.println(i + " - " + minhaListaCircular.getListaCircular(i));
        }

        System.out.println(" ========================");
        minhaListaCircular.adicionar("Joaquim", 0);

        for (int i = 0; i < minhaListaCircular.getTamanho(); i++) {
            System.out.println(i + " - " + minhaListaCircular.getListaCircular(i));
        }

        System.out.println(" ========================");
        minhaListaCircular.remover(0);

        for (int i = 0; i < minhaListaCircular.getTamanho(); i++) {
            System.out.println(i + " - " + minhaListaCircular.getListaCircular(i));
        }
    }
}
