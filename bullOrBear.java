package codechef.level500;

import java.util.Scanner;

public class bullOrBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc .nextInt();
        for (int i = 0; i < T  ; i++) {
            int X = sc.nextInt(); // bought the stock at value X
            int Y = sc.nextInt(); // sold it at value Y.
            int R = Y - X ;
            if ( R > 0 ) System.out.println("PROFIT");
            else if ( R == 0 ) System.out.println("NEUTRAL");
            else System.out.println("LOSS");    // R< 0

        }
    }
}
