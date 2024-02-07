package codechef.level500;

import java.util.Scanner;

public class chairsRequirment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); //  the number of students in the class
            int Y = sc.nextInt();  //  the number of chairs  already has.
            if (X>=Y) System.out.println(X-Y);
            else System.out.println("0");
        }
    }
}
