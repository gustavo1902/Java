package maratona.introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7 para representar o dia da semana: ");
        byte dia = scanner.nextByte();
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido, digite um número de 1 a 7.");
                break;
        }
        scanner.close();
    }
}
