package codechef.level500;

import java.util.Scanner;

public class kitchenTiming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt(); //  the starting of  working hours
            int Y = sc.nextInt(); // the  ending time of working hours
            System.out.println(Y-X);
        }
    }
}
