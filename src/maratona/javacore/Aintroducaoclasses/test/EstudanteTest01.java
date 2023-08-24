package maratona.javacore.Aintroducaoclasses.test;

import maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante= new Estudante();
        estudante.nome="Zeca";
        estudante.idade=20;
        estudante.sexo='M';
        System.out.println(estudante.idade);

    }
}
