package codechef.level500;

import java.util.Scanner;

public class carTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int X = sc.nextInt();
          if (X > 300 ) System.out.println(X*10);
          else System.out.println(3000);
        }
    }
}
