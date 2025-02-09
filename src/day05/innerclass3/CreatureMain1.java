package day05.innerclass3;

class Creature1{
    int life;

    class Animall{

    }

    public void method(){
        Animall animall = new Animall();
    }

}

public class CreatureMain1 {

    public static void main(String[] args) {
        Creature1 creature1 = new Creature1();
        creature1.method();
    }

}
