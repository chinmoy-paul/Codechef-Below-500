package codechef.level500;

import java.util.Scanner;

public class chefAndDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // chef income
            int Y =  sc.nextInt();  // chefin income
            System.out.println(Y - X );
        }
    }
}
