package codechef.level500;

import java.util.Scanner;

public class sixFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();     //cost of double room
            int Y = sc.nextInt();     // cost of triple room
            if (X*3 > Y*2 ) System.out.println(Y*2);
            else System.out.println(X*3);
        }
    }

}
