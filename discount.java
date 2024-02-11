package codechef.level500;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int x = sc.nextInt(); // discount percentage
            System.out.println(100-x);
        }
    }
}
