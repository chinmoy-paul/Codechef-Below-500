package codechef.level500;

import java.sql.SQLOutput;
import java.util.Scanner;

public class justOneMoreEpisode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); // the amount of time from now at which Chef's exam starts
            if ( X >= 24 ) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
