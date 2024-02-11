package codechef.level500;

import java.util.Scanner;

public class chefAndChocholates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int C = sc.nextInt();   // pieces of choc he wanaa gift
            int X = sc.nextInt();    // choc he have
            int Y = sc.nextInt();   // price per piece
            System.out.println((C-X)*Y);
        }
    }
}
