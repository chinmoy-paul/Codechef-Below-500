package codechef.level500;

import java.util.Scanner;

public class instagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // following  count
            int Y = sc.nextInt();    // followers count
            if ( X > Y * 10 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
