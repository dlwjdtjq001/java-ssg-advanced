package day01homework.polymorphism.ex3;

public class Bike extends Wheeler {

    public Bike(String carName, int velocity, int wheelNumber){
        super.carName = carName;
        super.velocity = velocity;
        super.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed;
        if(velocity > 40){
            velocity = 40;
            System.out.println(carName + "의 최고속도 위반으로 속도를" + velocity + "로 내립니다.");
        }else  {
            System.out.println(carName + "의 현재 속도는 " + velocity + "입니다.");
        }
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed;
        if(velocity < 10){
            velocity = 10;
            System.out.println(carName + "의 최저속도 위반으로 속도를" + velocity + "로 올립니다.");
        }else {
            System.out.println(carName + "의 현재 속도는 " + velocity + "입니다.");
        }
    }

    public int getWheelNumber() {
        return wheelNumber;
    }
}
