package POO.modificadorstatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
    // modificador estático -> atributo passa a pertencer à classe, com isso
    // todos os objetos compartilham do mesmo valor

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade máxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade límite "+ Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
