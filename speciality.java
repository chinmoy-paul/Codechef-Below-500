package codechef.level500;

import java.util.Scanner;

public class speciality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z =sc.nextInt();
            if (X > Y && X > Z ) System.out.println("setter");
            else if (Y > X && Y > Z) System.out.println("Tester");
            else if (Z > X && Z > Y ) System.out.println("Editorialist");
        }
    }
}
