package day03homework.animal;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getDistance() + (double)hours * getSpeed()/2);
    }

}
