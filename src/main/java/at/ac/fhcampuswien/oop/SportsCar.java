package at.ac.fhcampuswien.oop;

public class SportsCar extends Car {
    String make;

    public SportsCar(){
        super(0);
    }

    public SportsCar(int speed, String make){
        super(speed);
        this.make = "Ferrari";
    }

    @Override
    public void accelerate() { // widen access works
        super.accelerate();
        setSpeed(getSpeed()+1); // double acceleration
    }

    /*
    @Override
    private void accelerate() { // restrict access does not work
        super.accelerate();
    }
    */
}
