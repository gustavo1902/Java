package maratona.javacore.Hheranca.test;

import maratona.javacore.Hheranca.dominio.Endereco;
import maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 2", "012346-789");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Zeca");
        pessoa.setCpf("4111115555");
        pessoa.setEndereco(endereco);
    }
}

