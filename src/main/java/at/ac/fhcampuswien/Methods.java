package at.ac.fhcampuswien;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // print numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUntilNumber(sc.nextInt());
        printUntilNumber(n);
        printUntilNumber(10);

        int x = 10, y = 4;
        int result = diff(x,y);
        System.out.println("diff: " + result); // Wann?
        System.out.println("diff: " + diff(x,y)); // Wann?
        System.out.println("x: " + x);
    }

    public static void printUntilNumber(int number){
        for(int i = 1; i <= number ;i++){
            System.out.println(i);
        }
    }

    public static int diff(int x, int y){
        x = 100;
        System.out.println("x in method: " + x);
        return x - y;
    }

    public static double smallestNumber(double n1, double n2){
        if(n1 < n2) {
            return n1;
        }
        return n2;
    }
}
