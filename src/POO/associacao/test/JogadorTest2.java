package POO.associacao.test;

import POO.associacao.dominio.Jogador;
import POO.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Raphinha");
        Time time = new Time("FC Barcelona");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
