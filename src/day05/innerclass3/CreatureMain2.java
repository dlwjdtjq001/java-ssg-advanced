package day05.innerclass3;




class Creature2{
    private int life;

    // private 클래스, 오로지 creature2 에서만 접근 가능핸 내무 클래스 완성
    private class Animall{
        private String name = "tiger";
        int getOuter(){
            return life;
        }
    }

    public void method(){
        Animall animall = new Animall();

        //getter 없이 내부클래스의 private 멤버 적근
        System.out.println(animall.name);
        // 내부 클래스에서 외부 클래스 private 멤버 출력
        System.out.println(animall.getOuter());
    }

}

public class CreatureMain2 {

    public static void main(String[] args) {
        Creature1 creature1 = new Creature1();
        creature1.method();
    }

}
// 켑슐화를 통해서 외부에서의 접근을 차단하면서, 내부 클래스에서 외부 클래스의 멤버들을 제약없이 쉽게 접근할 수 있도록 구조적으로 프로그래밍 하였다.
// 클래스 수조를 숨겨서 코드의 복잡성도 줄임