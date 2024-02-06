package codechef.level500;

import java.util.Scanner;

public class determineTheScore {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // total points
            int N = sc.nextInt(); // no of test case chef passed
            int etn = X/10 ; // NO for passing each test case
            System.out.println(etn*N);

        }
    }
}
