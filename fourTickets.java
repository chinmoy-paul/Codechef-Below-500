package codechef.level500;

import java.util.Scanner;

public class fourTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int X = sc.nextInt();  // cost of each ticket
            int R = X * 4 ;
            if (R <= 1000 ) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}