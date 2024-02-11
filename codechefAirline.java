package codechef.level500;

import java.util.Scanner;

public class codechefAirline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  the capacity of each airplane
            int Y = sc.nextInt();  // the number of people willing to book a seat
            int Z = sc.nextInt();  // cost of each seat respectively.
            if (X*10 >= Y ) System.out.println(Y*Z);
            else System.out.println(X*10*Z);
        }
    }
}
