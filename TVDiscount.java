package codechef.level500;

import java.util.Scanner;

public class TVDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt(); // first tv price
            int B = sc.nextInt(); // second tv price
            int C = sc.nextInt(); // first tv discount
            int D = sc.nextInt(); // second  tv discount
            if (A-C > B - D ) System.out.println("SECOND");
            else if (A-C< B-D) System.out.println("FIRST");
            else System.out.println("ANY");
        }
    }
}
