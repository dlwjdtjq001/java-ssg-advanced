package day01.inheritence;

public sealed class sealedEx permits Employee, Manager {
    public String name;

    public void work(){
        System.out.println("일한다.");
    }
}
