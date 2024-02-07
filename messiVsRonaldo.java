package codechef.level500;
import java.util.Scanner;

public class messiVsRonaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();  // Goals messi
        int B = sc.nextInt();  // assists messi
        int X = sc.nextInt();   // goals ronaldo
        int Y  = sc.nextInt();   // assists ronaldo
        int M = A*2 + B ;      // points of messi
        int R = X * 2 + Y ;    // points of ronaldo
        if (M > R) System.out.println("MESSI");
        else if (M < R ) System.out.println("RONALDO");
        else  System.out.println("EQUAL");    // M=R


    }
}
