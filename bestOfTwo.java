package codechef.level500;

import java.util.Scanner;

public class bestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  // the marks scored in  first attempt
            int Y = sc.nextInt();   //  the marks scored in  second attempt
            System.out.println(Math.max(X,Y));
        }
    }
}
