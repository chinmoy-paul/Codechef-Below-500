package codechef.level500;

import java.util.Scanner;

public class secondMaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int a = Math.max(x,y);
            int b = Math.max(a,z);
            if (b== x ) System.out.println(Math.max(y,z));
            else if (b== y ) System.out.println(Math.max(x,z));
            else  System.out.println(Math.max(x,y));   // b = z
        }
    }
}
