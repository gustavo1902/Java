public class Main {
  public static void main(String[] args) {
    // Cria uma matriz de strings para armazenar os dados do mapa
    String[][] mapa = new String[5][5];

    // Preenche a matriz com as cores
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        // Gera um número aleatório entre 0 e 3
        int cor = (int)(Math.random() * 4);

        // Atribui a cor a cada posição do mapa
        if (cor == 0) {
          mapa[i][j] = "Vermelho";
        } else if (cor == 1) {
          mapa[i][j] = "Azul";
        } else if (cor == 2) {
          mapa[i][j] = "Verde";
        } else {
          mapa[i][j] = "Amarelo";
        }
      }
    }

    // Exibe o mapa na tela
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(mapa[i][j] + " ");
      }
      System.out.println();
    }
  }
}
