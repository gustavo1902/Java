package maratona.javacore.Fmodificadorestatico.test;

import maratona.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1= new Carro("BMW",350,250);
        Carro c2= new Carro("Fusca",390, 250);
        Carro c3= new Carro("Gol",420,250);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
