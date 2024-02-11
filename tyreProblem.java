package codechef.level500;

import java.util.Scanner;

public class tyreProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   //bikes
            int M = sc.nextInt();   // cars
            System.out.println(N*2+M*4);
        }
    }
}
