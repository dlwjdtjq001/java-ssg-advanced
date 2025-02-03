package day01;

public class CarMain {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        for(int i = 0; i < 3; i++){
            mycar1.speedUp();
        }
        System.out.println(mycar1.getSpeed());

        Car mycar2 = new SportCar();
        for(int i = 0; i < 5; i++){
            mycar2.speedUp();
        }
        System.out.println(mycar2.getSpeed());
    }
}

class Car {
    private int speed = 0;

    public final void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;
    }

    public void speedUp(){
        this.speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class SportCar extends Car {
    @Override
    public void speedUp() {
        for(int i = 0; i < 10; i ++){
            super.speedUp();
        }
    }
}

