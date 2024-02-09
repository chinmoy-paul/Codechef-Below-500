package codechef.level500;

import java.util.Scanner;

public class chefAndFireFrames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the length of the plate
            int M = sc.nextInt();  //  width of the plate
            int X = sc.nextInt();  // the cost of frame per cm
            System.out.println((2*(N+M))*X);


        }
    }
}
