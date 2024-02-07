package codechef.level500;

import java.util.Scanner;

public class octoberMarathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X  = sc.nextInt(); // the number of hours Chefina took to complete the marathon.
       if (X < 3 ) System.out.println("Gold");
       else if (X >= 3 && X<6 ) System.out.println("SILVER");
       else if ( X >= 6 ) System.out.println("BRONZE");
    }
}
