public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }
}