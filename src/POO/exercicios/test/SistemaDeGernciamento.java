package POO.exercicios.test;

import POO.associacao.dominio.Time;
import POO.exercicios.dominio.Aluno;
import POO.exercicios.dominio.Professor;
import POO.exercicios.dominio.Seminario;

public class SistemaDeGernciamento {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leandro", 17);
        Aluno aluno2 = new Aluno("Roberto", 18);

        Professor professor1 = new Professor("Xavi", "Matemática");
        Professor professor2 = new Professor("Javier", "Física");

        Aluno[] alunosParaSeminario = {aluno1, aluno2};
        Seminario seminario1 = new Seminario("Banco de Dados", "Amsterdã", alunosParaSeminario);
        Seminario seminario2 = new Seminario("SQL", "São Paulo", alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario1, seminario2};
        professor1.setSeminarios(seminariosDisponiveis);
        professor2.setSeminarios(seminariosDisponiveis);

        professor1.imprime();
        professor2.imprime();
    }
}
