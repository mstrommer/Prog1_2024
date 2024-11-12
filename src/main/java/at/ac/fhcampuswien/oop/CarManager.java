package at.ac.fhcampuswien.oop;

public class CarManager {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar(10, "extra");
        SportsCar sc2 = (SportsCar) sc.clone();
        System.out.println("");
    }
}
