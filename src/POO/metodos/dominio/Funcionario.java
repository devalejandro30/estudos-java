package POO.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios(double[] doubles) {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    private double media = 0;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        mediaDosSalarios();
    }

    public void mediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }
}
