package maratona.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.println(episodio + "");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
