package codechef.level500;

import java.util.Scanner;

public class readPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  // the number of pages
            int X = sc.nextInt(); // the number of pages Chef can read in a day
            int Y = sc.nextInt();  // the number of days.
            int R = X * Y ;   // total no of pages chef can read
            if ( R >= N ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}