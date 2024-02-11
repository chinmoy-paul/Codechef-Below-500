package codechef.level500;

import java.util.Scanner;

public class profitIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // initial selling price
            int Y = sc.nextInt();   // profit
            int B = X - Y ;
            int NS = X + (X/10);
            System.out.println(NS - B );

        }
    }
}
