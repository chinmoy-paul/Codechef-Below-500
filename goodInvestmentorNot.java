package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class goodInvestmentorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // interest  rate
            int Y = sc.nextInt();  // inflation rate
            if (X >= Y*2 ) System.out.println("YES");
            else System.out.println("NO");

         }
    }
}
