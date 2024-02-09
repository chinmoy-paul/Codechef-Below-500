package codechef.level500;

import java.util.Scanner;

public class theGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();  //  the amount Om has   respectively.
            int N = sc.nextInt();  //  the price of the laptop
            int M = sc.nextInt();   // the amount present in the Gymkhana fund
            if ( X + M >= N ) System.out.println("YES");
            else System.out.println("NO");
    }
}
