package codechef.level500;

import java.util.Scanner;

public class courseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();   // the size of the friend group
            int M = sc.nextInt(); // the capacity of the course
            int K = sc.nextInt();  //  the number of students already registered
            if (M-K >= N ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
