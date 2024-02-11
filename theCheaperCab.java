package codechef.level500;


import java.util.Scanner;

public class theCheaperCab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();  // first cab price
            int Y = sc.nextInt();  // second  cab price
            if (X < Y ) System.out.println("FIRST");
            else if (X==Y) System.out.println("ANY");
            else if (X > Y ) System.out.println("SECOND");

        }
    }
}
