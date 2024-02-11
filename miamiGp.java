package codechef.level500;

import java.util.Scanner;

public class miamiGp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            float X = sc.nextFloat();   // fastest timing
            float Y = sc.nextFloat();   // chef's timing
            if (Y >(X *107)/100) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
