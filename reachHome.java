package codechef.level500;

import java.util.Scanner;

public class reachHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // the amount of fuel in Chef’s motorcycle
            int Y = sc.nextInt(); //  the distance to Chef’s home in kilometres.
            if (X * 5 >= Y ) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
