package at.ac.fhcampuswien;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] enteredNumbers = getNumbersFromUser(5);
        System.out.print("Entered numbers: ");
        for(int number : enteredNumbers){
            System.out.print(number + " ");
        }
    }

    public static int[] getNumbersFromUser(int length){
        int[] enteredNumbers = new int[length];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            enteredNumbers[i] = sc.nextInt();
        }
        return enteredNumbers;
    }
}