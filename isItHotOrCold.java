package codechef.level500;

import java.util.Scanner;

public class isItHotOrCold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int C = sc.nextInt();
            if (C > 20 ) System.out.println("HOT");
            else System.out.println("COLD");

        }
    }
}
