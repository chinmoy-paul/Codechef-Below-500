package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int x = Math.max(A,B);
        int y = Math.max(x,C);
        if (y==A ) System.out.println("Alice");
        else if (y==B) System.out.println("Bob");
        else System.out.println("Charlie");  // y=C
        }
    }
}
