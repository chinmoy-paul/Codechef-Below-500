package codechef.level500;

import java.util.Scanner;

public class interiordesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            if (X1 + Y1 < X2 + Y2 ) System.out.println(X1+Y1);
            else System.out.println(X2+Y2);
        }
    }
}
