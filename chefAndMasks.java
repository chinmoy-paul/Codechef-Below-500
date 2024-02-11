package codechef.level500;

import java.util.Scanner;

public class chefAndMasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // disposable
            int Y = sc.nextInt();   // cloth
            if (X * 100 < Y * 10 ) System.out.println("DISPOSABLE");
            else System.out.println("CLOTH");

        }
    }
}
