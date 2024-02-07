package codechef.level500;

import java.util.Scanner;

public class manaPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // the cost of one special attack
            int Y = sc.nextInt();  // the number of mana points Chefario
            int R = Y / X ;
            if (R >= 1 ) System.out.println(R);
            else System.out.println("0");
        }
    }
}
