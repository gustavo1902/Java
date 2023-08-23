package maratona.introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine(); // Lê uma linha inteira, incluindo espaços

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine(); // Lê uma linha inteira

        System.out.print("Digite o valor do salário recebido: ");
        String salario = scanner.next();


        System.out.print("Digite a data que recebeu o salário: ");
        String data = scanner.next();

        System.out.println("Eu: " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data);

        scanner.close();
    }
}

