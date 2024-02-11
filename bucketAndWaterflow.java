package codechef.level500;

import java.util.Scanner;

public class bucketAndWaterflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int W = sc.nextInt();   // initially having water
            int X = sc.nextInt();   // max capacity of the bucket
            int Y = sc.nextInt();   //flowing into the bucket at a rate of y litre / hour
            int Z = sc.nextInt();  // left the tap running for Z hours
            if (X > W+(Y*Z)) System.out.println("UNFILLED");
            else if (X < W+(Y*Z)) System.out.println("OVERFLOW");
            else System.out.println("FILLED");
        }
    }
}
