package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.dominio.Jogador;
import maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("D");
        jogador1.imprime();
        Time time = new Time("E");

        jogador1.setTime(time);
    }
}
