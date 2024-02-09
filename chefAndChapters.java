package codechef.level500;

import java.util.Scanner;

public class chefAndChapters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // no of courses
            int Y = sc.nextInt();   // no of units
            int Z = sc.nextInt();   // no of chapters
            System.out.println(X*Y*Z);

        }
    }
}
