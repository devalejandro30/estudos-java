package POO.classesabstratas.test;

import POO.classesabstratas.dominio.Desenvolvedor;
import POO.classesabstratas.dominio.Gerente;
import POO.classesabstratas.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alejandro", 8000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Roberto", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
