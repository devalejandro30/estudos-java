package POO.sobrecargametodos.teste;

import POO.sobrecargametodos.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Demon Slayer", "TV", 12, "Ação");
        anime.imprime();
    }
}
