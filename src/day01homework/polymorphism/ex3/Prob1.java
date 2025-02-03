package day01homework.polymorphism.ex3;

public class Prob1 {
    public static void main(String[] args) {
        Wheeler truck = new Truck("트럭", 0, 4);
        Wheeler bike = new Bike("자전거", 0, 2);

        System.out.println(truck.carName + " : " + "바퀴 " + truck.wheelNumber + "개입니다.");
        System.out.println(bike.carName + " : " + "바퀴 " + bike.wheelNumber + "개입니다.");
        truck.speedUp(20);
        bike.speedUp(25);
        truck.speedDown(150);
        bike.speedDown(20);
        truck.stop();
        bike.stop();
    }
}
