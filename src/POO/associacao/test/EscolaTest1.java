package POO.associacao.test;

import POO.associacao.dominio.Escola;
import POO.associacao.dominio.Professor;

// bidirecional
public class EscolaTest1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Jiraya");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola(professores, "Academia da Vila da Folha");

        escola.imprime();
    }
}
