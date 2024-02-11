package codechef.level500;

import java.util.Scanner;

public class trueAndFalsePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  //  the total number of questions in the exam
            int K = sc.nextInt();  // the score of Alice.
            System.out.println(N-K);
        }
    }
}
