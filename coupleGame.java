package codechef.level500;

import java.util.Scanner;

public class coupleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int G = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(B-G);

        }
    }
}
