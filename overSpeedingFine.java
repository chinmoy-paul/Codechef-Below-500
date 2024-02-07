package codechef.level500;

import java.util.Scanner;

public class overSpeedingFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if (X <= 70 ) System.out.println("0");
            else if ( X> 70 && X <= 100 ) System.out.println("500");
            else if ( X > 100 ) System.out.println("2000");

        }
    }
}
