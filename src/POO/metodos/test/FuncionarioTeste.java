package POO.metodos.test;

import POO.metodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Theo");
        funcionario.setIdade(2);
        funcionario.getSalarios(new double[]{1570, 4500, 8700}) ;
        funcionario.imprimeDados();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
