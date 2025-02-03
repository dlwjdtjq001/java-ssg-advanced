package day01;

public class AirPlaneMain {
    public static void main(String[] args) {
        //AirPlane 생성 , 이륙 , 날다, 착륙하다 수행
        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
        //SuperAirPlane 생성 , 이륙, 날다 착륙 수행
        SuperAirplane superAirPlane = new SuperAirplane();
        superAirPlane.takeOff();
        superAirPlane.flyMode = SuperAirplane.ADVANCED;
        superAirPlane.fly();
        superAirPlane.land();
    }
}
