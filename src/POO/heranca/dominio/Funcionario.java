package POO.heranca.dominio;

public class Funcionario extends Pessoa {
    // todas as classes são um objeto -> herança da classe <Object>
    // herança
    // não existe herança múltipla
    // o funcionário terá todos os atributos e métodos que a classe Pessoa apresenta
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    // herança c/ construtores
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    // sobrescrita -> muda o comportamento do metodo imprime na classe Funcionario
    public void imprime(){
        // super -> refere-se ao objeto mais genérico >>> objeto Pessoa
        super.imprime();
        System.out.println(this.salario);
    }

    // protected -> permite o acesso dentro do mesmo pacote ou se for uma subclasse
    public void relatorioPagamneto(){
        System.out.println("Eu "+this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
