package POO.metodos.test;

import POO.metodos.dominio.Estudante;
import POO.metodos.dominio.ImpressoraEstudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Roberto";
        estudante01.idade = 48;
        estudante01.sexo = 'M';

        estudante02.nome = "Rafeal";
        estudante02.idade = 75;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
