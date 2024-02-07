package codechef.level500;

import java.util.Scanner;

public class sumIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A+B == C ) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
