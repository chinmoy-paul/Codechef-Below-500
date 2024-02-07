package codechef.level500;

import java.util.Scanner;

public class getSubscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // duration of the meet
            if (X <= 30 ) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
