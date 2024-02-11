package codechef.level500;

import java.util.Scanner;

public class firstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int fd = N ;
            int ld = N % 10 ;         // last digit

            int count = 0 ;   // no of digits findout
            while ( N != 0 )
            {
                N = N/10;
                count ++;
            }
            int x = 1 ;
            for (int j = 0; j < count-1; j++) {
                x = x*10 ;
            }
            fd=fd/x;
            System.out.println(fd+ld);
        }

    }
}
