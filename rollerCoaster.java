package codechef.level500;

import java.util.Scanner;

public class rollerCoaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc .nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();   // the height of the boy
            int H =sc.nextInt();     // minimum height required
            if (X >= H ) System.out.println("YES");
            else System.out.println("No");
        }













    }


}
