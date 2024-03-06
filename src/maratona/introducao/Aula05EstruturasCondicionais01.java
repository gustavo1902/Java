package maratona.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    /*
    * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite à sua idade:");
        int idade = scanner.nextInt();
        boolean isAutorizado = idade >= 18;
        // !
        if (isAutorizado) {
            System.out.println("Autorizado");
        }else{
            System.out.println("Não autorizado");
        }

        System.out.println("fora do if");
    * */
    public static void main (String []args){

    Scanner scanner = new Scanner(System.in);

        // Leitura do peso do usuário
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        // Leitura da altura do usuário
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibição do IMC e classificação
        System.out.printf("Seu IMC é %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();

    }
}
