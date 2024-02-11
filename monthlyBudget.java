package codechef.level500;

import java.util.Scanner;

public class monthlyBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // TOTAL MONEY
            int Y = sc.nextInt();  // EACH DAY EXPENSE
            if (X >= Y * 30 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
