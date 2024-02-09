package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class multivitaminTablets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // no of days
            int Y = sc.nextInt();  // no of tablets already have
            if (Y >= X*3) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}
