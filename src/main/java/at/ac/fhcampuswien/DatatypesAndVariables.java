package at.ac.fhcampuswien;

import java.util.Scanner;

public class DatatypesAndVariables {
    public static void main(String[] args) {
        int i = 1;
        int result = 5 + --i;
        System.out.println(result);
        System.out.println(i);
        result = Methods.diff(4,2);
        System.out.println(result);
    }
}