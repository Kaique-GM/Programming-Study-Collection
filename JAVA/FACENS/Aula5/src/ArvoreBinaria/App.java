public class App {
    public static void main(String[] args) throws Exception {

        ArvoreBinaria minhaArvoreBinaria = new ArvoreBinaria();

        minhaArvoreBinaria.adicionar(50);
        minhaArvoreBinaria.adicionar(23);
        minhaArvoreBinaria.adicionar(45);
        minhaArvoreBinaria.adicionar(67);
        minhaArvoreBinaria.adicionar(89);
        minhaArvoreBinaria.adicionar(86);
        minhaArvoreBinaria.adicionar(56);
        minhaArvoreBinaria.adicionar(45);
        minhaArvoreBinaria.adicionar(344);

        // int profundidade = minhaArvoreBinaria.buscarProfundidade(344);
        //// System.out.println(profundidade);

        minhaArvoreBinaria.printArvore();

    }
}
