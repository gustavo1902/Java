package maratona.javacore.Bintroducaometodos.test;

import maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Zeca";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987, 2000};
        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
