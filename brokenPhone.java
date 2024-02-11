package codechef.level500;

import java.util.Scanner;

public class brokenPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // the cost of getting the phone repaired
            int Y = sc.nextInt();  //  the cost of buying a new phone.
            if (X > Y ) System.out.println("NEW PHONE");
            else if ( Y > X ) System.out.println("REPAIR");
            else System.out.println("ANY");

        }
    }
}
