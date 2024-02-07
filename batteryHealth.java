package codechef.level500;

import java.util.Scanner;

public class batteryHealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); //  the battery health
            if (X >= 80 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
