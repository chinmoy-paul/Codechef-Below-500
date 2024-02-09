package codechef.level500;

import java.util.Scanner;

public class spiceLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if (X < 4) System.out.println("MILD");
            else if (X >= 4 && X < 7 ) System.out.println("MEDIUM");
            else if ( X >= 7 ) System.out.println("HOT");
        }
    }
}
