package codechef.level500;

import java.util.Scanner;

public class donationDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); //the number of required donations
            int X = sc.nextInt(); // the number of collected donations
            System.out.println(N-X);
        }
    }
}
