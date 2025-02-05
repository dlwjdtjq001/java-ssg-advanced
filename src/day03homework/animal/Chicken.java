package day03homework.animal;

public class Chicken extends Animal implements Cheatable {

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getDistance() + hours * getSpeed());
    }

    @Override
    public void fly() {
        setSpeed(getSpeed()*2);
    }

}
