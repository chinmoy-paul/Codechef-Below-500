package codechef.level500;
import java.util.Scanner;

public class chefOnDate {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc .nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // amount with him
            int Y = sc.nextInt();   // bill amount
            if ( X- Y >= 0 ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
