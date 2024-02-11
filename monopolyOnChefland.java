package codechef.level500;

import java.util.Scanner;

public class monopolyOnChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            if (R3 > R1+R2 || R2>R3+R1 || R1 > R2+R3 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
