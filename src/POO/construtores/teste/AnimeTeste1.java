package POO.construtores.teste;

import POO.construtores.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer", "TV", 12, "Ação", "Marvel");
        anime.imprime();
    }
}
