package codechef.level500;

import java.util.Scanner;

public class bobAtTheBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
         int W = sc.nextInt();   //  the initial amount
         int X = sc.nextInt();   // the amount deposited per month
         int Y = sc.nextInt();   //  the amount deducted per month
         int Z = sc.nextInt();  // the number of months
            System.out.println( W + X*Z - Y*Z);
        }
    }
}
