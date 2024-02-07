package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class passesForFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // No of friends
            int K = sc.nextInt();   // No of passes he have
            if (K >= (N+1) ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
