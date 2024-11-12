package at.ac.fhcampuswien.oop;

public class Polymorph {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Gibt "Bark" aus, nicht "Generic sound"
    }
}

class Animal {
    void makeSound() { System.out.println("Generic sound"); }
}

class Dog extends Animal {
    void makeSound() { System.out.println("Bark"); }
}


