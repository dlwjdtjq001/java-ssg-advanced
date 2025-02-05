package day03homework.factory;

public class TVFactory extends Factory implements IWorkingTogether{

    public TVFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((Factory)partner).makeProducts('C');
    }

    @Override
    public int makeProducts(char skill) {
        switch(skill){
            case 'A' : return this.getWorkingTime() * 8;
            case 'B' : return this.getWorkingTime() * 5;
            case 'C' : return this.getWorkingTime() * 3;
            default: return this.getWorkingTime();
        }
    }

}
