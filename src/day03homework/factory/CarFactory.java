package day03homework.factory;

public class CarFactory extends Factory implements IWorkingTogether{


    public CarFactory(String name, int openHour, int closeHour){
        super(openHour, closeHour, name);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((Factory)partner).makeProducts('B');
    }

    @Override
    public int makeProducts(char skill) {
        switch(skill){
            case 'A' : return this.getWorkingTime() * 3;
            case 'B' : return this.getWorkingTime() * 2;
            case 'C' : return this.getWorkingTime();
            default: return 0;
        }



    }
}
