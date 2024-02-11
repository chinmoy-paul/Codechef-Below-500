package codechef.level500;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();  // wanaa withdraw
        float  Y = sc.nextFloat();  // initial account balanceS
        if ( Y >= (X+0.50) && X % 5 == 0 )  System.out.format("%.2f" , Y -(X+0.50) );
        else System.out.format("%.2f", Y );

    }
}
