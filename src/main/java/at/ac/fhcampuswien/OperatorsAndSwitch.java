package at.ac.fhcampuswien;

import java.util.Scanner;

public class OperatorsAndSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int input = scan.nextInt();

        if(input == 0){
            System.out.println("Division durch 0");
        } else {
            System.out.println(2 / input);
        }

        System.out.println("Geben Sie eine Postleitzahl ein: ");
        int zipCode = scan.nextInt();
        // 1000 - 9999
        if(zipCode > 999 && zipCode < 10000){
            System.out.println("Die Postleitzahl ist gültig!");
        } else {
            System.out.println("Die Postleitzahl ist ungültig!");
        }

        String dayOfWeek = scan.next();
        int day;
        switch(dayOfWeek){
            case "Montag" :
                day = 1;
                // break;
            case "Dienstag" :
                day = 2;
                // break;
            case "Mittwoch" :
                day = 3;
                // break;
            default:
                day = -1;
                System.out.println("Falsches Format");
        }
        System.out.println("Interner Wert: " + day);
    }
}
