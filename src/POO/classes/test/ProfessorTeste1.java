package POO.classes.test;

import POO.classes.dominio.Professor;

// aula de coesão (um propósito por classe)

public class ProfessorTeste1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Celino";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Nome:"+ professor.nome + " idade:"+ professor.idade +
                " sexo:"+ professor.sexo);
    }
}
