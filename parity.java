package codechef.level500;

import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // number of chocolates they received
            if ( N % 2 ==  0 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
