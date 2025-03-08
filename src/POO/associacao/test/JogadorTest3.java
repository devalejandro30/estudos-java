package POO.associacao.test;

import POO.associacao.dominio.Jogador;
import POO.associacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Vitinha");
        Time time = new Time("PSG");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
