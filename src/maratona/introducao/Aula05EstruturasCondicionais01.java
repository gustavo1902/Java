package maratona.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
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
    }
}
