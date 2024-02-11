package codechef.level500;


import java.util.Scanner;

public class parliament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the total number of members present in the Parliament
            int X = sc.nextInt();   // and the number of members who voted in favour of the resolution.
            if (  N % 2 == 0  &&  X >= N/2) System.out.println("YES");
            else if ( N % 2 != 0 && X >= (N / 2) + 1  ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
