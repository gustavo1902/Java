package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("A");
        Jogador jogador2 = new Jogador("B");
        Jogador jogador3 = new Jogador("C");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
