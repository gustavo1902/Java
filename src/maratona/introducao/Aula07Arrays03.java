package maratona.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[]numeros = new int[3];
        int[]numeros1 = {1,2,3,4,5};
        int[]numeros2 = new int[]{1,2,3,4,5};
        for (int num : numeros2){
            System.out.println(num);
        }
    }
}
