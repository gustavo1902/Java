package maratona.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array={1,2,3};
        int[][] araryInt2={{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[]arrayBase:araryInt2){
            System.out.println("\n------");
            for(int num: arrayBase){
                System.out.println(num+"");
            }
        }
    }
}
