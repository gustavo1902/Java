import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicita o nome do usuário
    System.out.print("Digite o seu nome: ");

    // Lê a entrada do usuário e armazena em uma variável
    String nome = scanner.nextLine();

    // Exibe o nome do usuário
    System.out.println("O seu nome é " + nome);
  }
}
