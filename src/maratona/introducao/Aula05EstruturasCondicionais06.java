package maratona.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o respectivo número para o dia da semana: ");
        byte dia = scanner.nextByte();
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção inválida");
                break;

        }
    }
}
