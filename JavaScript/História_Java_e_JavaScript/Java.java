public class Java extends Thread {
    
    // public static void main(String[] args) {
    // // COD 1
    // int numero = 10; // Declaração de uma variável inteira
    // System.out.println(numero);
    // // Não é possível fazer isso: número = "dez"; // Erro, pois "numero" é do
    // tipo
    // // int

    // // COD 2
    // System.out.println("Olá, Mundo!"); // Saída no console

    // // COD 3
    // // saudacao();// Chamando o método

    // // COD 4
    // Pessoa pessoa = new Pessoa("Carlos");
    // pessoa.saudacao();

    // }

    // COD 5
    public void run() {
        System.out.println("Tarefa em segundo plano em Java!");
    }

    public static void main(String[] args) {
        Java tarefa = new Java();
        tarefa.start(); // Inicia a thread
    }
}
