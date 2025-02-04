package day01homework.polymorphism.ex3;
import java.util.HashMap;
import java.util.Map;

public class Prob1 {
    public static void main(String[] args) {
        Map<String, Wheeler> vehicles = new HashMap<>();

        Wheeler truck = new Truck("트럭", 0, 4);
        Wheeler bike = new Bike("자전거", 0, 2);

        vehicles.put("truck", truck);
        vehicles.put("bike", bike);

        for (Map.Entry<String, Wheeler> entry : vehicles.entrySet()) {
            Wheeler vehicle = entry.getValue();
            System.out.println(vehicle.carName + " : " + "바퀴 " + vehicle.wheelNumber + "개입니다.");
        }

        vehicles.get("truck").speedUp(20);
        vehicles.get("bike").speedUp(25);
        vehicles.get("truck").speedDown(150);
        vehicles.get("bike").speedDown(20);
        vehicles.get("truck").stop();
        vehicles.get("bike").stop();
    }
}