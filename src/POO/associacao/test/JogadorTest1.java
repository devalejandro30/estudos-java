package POO.associacao.test;

import POO.associacao.dominio.Jogador;

public class JogadorTest1 {

    // associação -> relacionamento entre classes/objetos

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedri");
        Jogador jogador2 = new Jogador("Yamal");
        Jogador jogador3 = new Jogador("Palmer");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
