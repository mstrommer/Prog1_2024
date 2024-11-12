package at.ac.fhcampuswien.oop;

public class Car implements Cloneable {
    private int speed;

    public Car(int speed){
        this.speed = speed;
    }

    void accelerate(){
        this.speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
