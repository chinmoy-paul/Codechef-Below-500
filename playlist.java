package codechef.level500;

import java.util.Scanner;

public class playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // Duration of train journey
            int X = sc.nextInt();   // Duration of each song
            int Y = X*3 ; // duration of songs per session
            System.out.println(N/Y);

        }
    }
}
