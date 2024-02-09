package codechef.level500;

import java.util.Scanner;

public class finalPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int X =sc.nextInt(); // current population
          int Y = sc.nextInt();  // people who left
          int Z = sc.nextInt();  // people who came
            System.out.println(X -Y + Z);
        }
    }
}
