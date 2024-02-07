package codechef.level500;

import java.util.Scanner;

public class rainInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            if (X < 3 ) System.out.println("LIGHT");
            else if ( X >= 3 && X < 7 ) System.out.println("Moderate ");
            else if (X >= 7 ) System.out.println("Heavy");
        }
    }
}
