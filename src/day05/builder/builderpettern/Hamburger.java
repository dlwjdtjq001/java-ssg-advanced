package day05.builder.builderpettern;

//Setter 메서드를 사용한 자바빈 으로 리펙토링

public class Hamburger {
    private String bun;
    private String patty;
    
    //선택 멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

     public Hamburger(BurgerBuilder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }

    static class BurgerBuilder{
        private String bun;
        private String patty;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;

        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        //선택적 요소를 단계적으로 추가할 수 있도록 메서드를 설계

        public BurgerBuilder addCheese(){
            this.cheese = true;
            return this;
        }
        public BurgerBuilder addLettuce(){
            this.lettuce = true;
            return this;
        }
        public BurgerBuilder addTomato(){
            this.tomato = true;
            return this;
        }
        public BurgerBuilder addBacon(){
            this.bacon = true;
            return this;
        }
        // 핵심 최졷적으로 BurgerBuilder 객체를 반환하는 메서드

        public Hamburger build(){
            return new Hamburger(this);
        }
        //end of inner
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bun=" + bun +
                ", patty=" + patty +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}
