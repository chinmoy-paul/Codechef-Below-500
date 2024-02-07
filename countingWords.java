package codechef.level500;

import java.util.Scanner;

public class countingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt(); //  the number of pages
           int M = sc.nextInt(); //  the number of words on each page
            System.out.println(N*M);

        }
    }
}
