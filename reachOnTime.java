package codechef.level500;

import java.util.Scanner;

public class reachOnTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            // Chef left for the office X minutes before Chef was supposed to reach.
            int X = sc.nextInt();  // left before X min time
            if ( X < 30 ) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
