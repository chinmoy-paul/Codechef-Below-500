package codechef.level500;

import java.util.Scanner;

public class chefAndGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
         int X = sc.nextInt();   // gym cost
         int Y = sc.nextInt();   // personal trainer cost
         int Z = sc.nextInt();   // gym budget per month
            if (Z >= X+Y ) System.out.println(2);
            else if (Z >= X && Z < X+Y) System.out.println(1);
            else if (Z<X ) System.out.println(0);
        }
    }
}
