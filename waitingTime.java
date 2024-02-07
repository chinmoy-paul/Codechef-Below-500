package codechef.level500;

import java.util.Scanner;

public class waitingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int K = sc.nextInt();   // no of weeks
            int X = sc.nextInt();   // no of days passed
            System.out.println((K*7) - X );

        }

    }
}
