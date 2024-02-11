package codechef.level500;

import java.util.Scanner;

public class theMangoTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   //  the weight of mango
            int Y = sc.nextInt();  //  the weight of truck
            int Z = sc.nextInt();   // the weight the bridge can withstand
            int nom = (Z - Y) / X ;
            System.out.println(nom);


        }
    }
}
