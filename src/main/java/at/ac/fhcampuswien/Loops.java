package at.ac.fhcampuswien;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("==== For Loop ====");

        for (int i = 0; i < 5; i = i + 1) {
            System.out.print("* ");
            System.out.println(i); // OK
        }
        // System.out.println(i); Nicht OK

        System.out.println("==== While Loop ====");

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("n" + (count + 1) + " : ");
            int value = scan.nextInt();
            sum = sum + value;
            count = count + 1;
        }
        System.out.println("sum is " + sum);
    }
}
