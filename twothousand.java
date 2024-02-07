package codechef.level500;

import java.util.Scanner;

public class twothousand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N - the number of notes of Rs. 2000
        System.out.println((2000/500)*N);
    }
}