package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.dominio.Escola;
import maratona.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Zeca");
        Professor[] professores = {professor};
        Escola escola = new Escola("A");
        escola.setProfessores(professores); // Associa o array de professores à escola
        escola.imprime();
    }
}

