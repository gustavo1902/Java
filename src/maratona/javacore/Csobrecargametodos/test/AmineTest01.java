package maratona.javacore.Csobrecargametodos.test;

import maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AmineTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Zizaw", "Tv", 12, "ação");
        anime.init("Zizaw", "Tv", 12);
        anime.imprime();
    }
}
