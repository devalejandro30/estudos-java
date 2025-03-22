package POO.heranca.test;

import POO.heranca.dominio.Endereco;
import POO.heranca.dominio.Funcionario;
import POO.heranca.dominio.Pessoa;

// herança -> usado quando quer se estender a funcionalidade/usar polimorfismo de uma classe e
// manter o relacionamento entre elas
// aumenta o acoplamento do código

public class HerancaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 3","012345000-67");
        Pessoa pessoa = new Pessoa("Heitor");
        pessoa.setCpf("000000000");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Eduardo");
        funcionario.setCpf("11111111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4000);
        System.out.println("-------");
        funcionario.imprime();
    }
}
