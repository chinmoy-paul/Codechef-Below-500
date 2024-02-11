package codechef.level500;

import java.util.Scanner;

public class pendingAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X  = sc.nextInt();   // the number of assignments
            int Y = sc.nextInt();    // time taken in minutes to complete each assignment,
            int Z = sc.nextInt();    // the number of days in which Chef wants to complete the assignments
            if ( X*Y <= Z*24*60 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
