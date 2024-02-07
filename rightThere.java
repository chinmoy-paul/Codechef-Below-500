package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rightThere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N  = sc.nextInt();  // total people
            int X = sc.nextInt();  // party hall capacity
            if ( X >= N ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
