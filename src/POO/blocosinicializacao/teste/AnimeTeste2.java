package POO.blocosinicializacao.teste;

import POO.blocosinicializacao.dominio.Anime;

public class AnimeTeste2 {
    public static void main(String[] args) {
        Anime anime= new Anime("Solo Leving");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
