package codechef.level500;

import java.util.Scanner;

public class tomAndJerryCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // speed of JERRY
            int Y = sc.nextInt(); // speed of TOM
            if ( Y >= X ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
