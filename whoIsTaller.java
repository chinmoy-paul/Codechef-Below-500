package codechef.level500;

import java.util.Scanner;

public class whoIsTaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y ) System.out.println("A");
            else System.out.println("B");
        }
    }
}
