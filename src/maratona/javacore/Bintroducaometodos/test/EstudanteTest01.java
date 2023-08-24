package maratona.javacore.Bintroducaometodos.test;

import maratona.javacore.Bintroducaometodos.dominio.Estudante;
import maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Zeca";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Zica";
        estudante02.idade= 18;
        estudante02.sexo= 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
