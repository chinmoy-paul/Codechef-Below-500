package codechef.level500;

import java.util.Scanner;

public class dominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int NA = sc.nextInt();
            int NB = sc.nextInt();
            int NC = sc.nextInt();
            if (NA>NB+NC || NB>NA+NC || NC>NA+NB) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
