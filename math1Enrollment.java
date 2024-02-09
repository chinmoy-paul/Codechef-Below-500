package codechef.level500;

import java.util.Scanner;

public class math1Enrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();  //the current number of seats
            int Y = sc.nextInt();  // the number of students interested
            if (Y >= X ) System.out.println(Y-X);
            else System.out.println("0");

        }
    }
}
