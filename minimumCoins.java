package codechef.level500;

import java.util.Scanner;

public class minimumCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // amount of money needed to pay
            System.out.println(X%10);
        }
    }
}
