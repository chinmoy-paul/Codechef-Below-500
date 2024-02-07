package codechef.level500;

import java.util.Scanner;

public class chessTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // free hours
            System.out.println((N*60)/20);

        }
    }
}
