package day05.builder.builderpettern;

import lombok.Builder;
import lombok.Getter;


public class HamburgerSet {
    private Hamburger hamburger;
    private String potato;
    private String drink;

    public HamburgerSet(BurgerSet builder){
        hamburger = builder.hamburger;
        potato = builder.potato;
        drink = builder.drink;

    }

    static class BurgerSet{
        private Hamburger hamburger;
        private String potato;
        private String drink;

        public BurgerSet(Hamburger hamburger){
            this.hamburger = hamburger;
        }

        public BurgerSet addDrink(String s){
            drink = s;
            return this;
        }

        public BurgerSet addPotato(String s){
            potato = s;
            return this;
        }

        public HamburgerSet build(){
            return new HamburgerSet(this);
        }
    }

    @Override
    public String toString() {
        return "HamburgerSet{" +
                "hamburger=" + hamburger.toString() +
                ", potato='" + potato + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
