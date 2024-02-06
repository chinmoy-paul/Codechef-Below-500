package codechef.level500;

import java.util.Scanner;

public class iplTicketRush {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N =sc .nextInt();   // the number of students wants to go
            int M = sc .nextInt();  //  the total number of tickets available
           if(N-M >= 1 ) System.out.println(N - M );   // No of students who won't be able to go
            else System.out.println("0");
        }
    }
}
