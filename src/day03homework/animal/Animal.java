package day03homework.animal;

public abstract class Animal {
    private int speed;
    private  double distance;

    public Animal(int speed) {
        this.speed = speed;
    }

    public abstract void run(int hours);

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
