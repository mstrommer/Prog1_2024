package at.ac.fhcampuswien.animals;

public class App {
    public static void main(String[] args) {
        Dog pluto = new Dog("Pluto");
        Cat garfield = new Cat("Garfield");
        Animal a1 = pluto;
        NoiseCapable nc = pluto;
        a1.eat();
        nc.makeNoise();
        pluto.bark();
        Animal[] animals = {pluto, garfield};
        System.out.println();
        printAnimals(animals);
    }

    public static void printAnimals(Animal[] animals){
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
}
