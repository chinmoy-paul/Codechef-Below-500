package codechef.level500;

import java.util.Scanner;

public class totalPrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
         int X = sc.nextInt();  // X = the prize for top 10
         int Y = sc.nextInt();  // Y = prize for 11 to 100
            System.out.println((10*X) + (90 * Y) );

        }
    }
}
