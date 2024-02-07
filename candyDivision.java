package codechef.level500;

import java.util.Scanner;

public class candyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = sc.nextInt(); //  the number of candies.
            if ( N % 3 == 0 ) System.out.println("Yes");
            else System.out.println("NO");
        }
    }
}
