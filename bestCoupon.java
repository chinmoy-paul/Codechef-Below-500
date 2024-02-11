package codechef.level500;

import java.util.Scanner;

public class bestCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // total bill amount
            int C1 = (X*10)/100;
            int C2 = 100 ;
            System.out.println(Math.max(C1,C2));
        }
    }
}
