package POO.metodos.test;

import POO.metodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Theo";
        funcionario.idade = 2;
       funcionario.salarios = new double[]{1570, 4500, 8700};

        funcionario.imprimeDados();
    }
}
