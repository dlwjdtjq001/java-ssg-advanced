package day03homework.factory;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public Factory(int openHour, int closeHour, String name) {
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.name = name;
    }

    public String getFactoryName(){
        return this.name;
    }

    public int getWorkingTime(){
        return this.closeHour - openHour;
    }

    public abstract int makeProducts(char skill);

}
