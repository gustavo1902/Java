
import java.util.*;

public class grafo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, ba, bb, bc, bd, be, bf, bg, bh, bi, bj, bk, bl, bm, bn, bo, bp, bq, br, bs, bt, bu, bv;
        int vetor[] = new int[10];
        int aux = 0;
        int aq = 0;
        int ar = 0;
        int as = 0;
        int at = 0;
        int au = 0;
        int av = 0;
        int aw = 0;
        int ax = 0;
        int ay = 0;
        int az = 0;
        int ba = 0;
        int bb = 0;
        int bc = 0;
        int bd = 0;
        int be = 0;
        int bf = 0;
        int bg = 0;
        int bh = 0;
        int bi = 0;
        int bj = 0;
        int bk = 0;
        int bl = 0;
        int bm = 0;
        int bn = 0;
        int bo = 0;
        int bp = 0;
        int bq = 0;
        int br = 0;
        int bs = 0;
        int bt = 0;
        int bu = 0;
        int bv = 0;

        System.out.println("Digite 10 numeros");
        for (i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }
        for (j = 0; j < 10; j++) {
            for (k = 0; k < 9; k++) {
                if (vetor[k] > vetor[k + 1]) {
                    aux = vetor[k];
                    vetor[k] = vetor[k + 1];
                    vetor[k + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado");
        for (l = 0; l < 10; l++) {
            System.out.println(vetor[l]);
        }
    }
}
