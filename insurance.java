package codechef.level500;

import java.util.Scanner;

public class insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
         int X = sc.nextInt();  // max rebateable amount
            int Y = sc.nextInt();   // needed money for repair
            if (Y > X ) System.out.println(X);
            else System.out.println(Y);
        }
    }
}
