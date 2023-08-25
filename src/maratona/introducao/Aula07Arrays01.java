package maratona.introducao;
public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 25;
        idades[2] = 11;
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
