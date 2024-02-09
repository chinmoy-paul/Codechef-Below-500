package codechef.level500;

import java.util.Scanner;

public class chefGivesParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt();    //  the number friends
           int X = sc.nextInt();    //  the cost of each burger
           int K = sc.nextInt();    //  the total money
           if (K >= N*X ) System.out.println("YES");
           else System.out.println("NO");

        }
    }
}
