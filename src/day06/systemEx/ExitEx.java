package day06.systemEx;

public class ExitEx {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(" ");
            System.out.println(i);
            if(i == 8){
                System.out.println("종료");
                System.exit(0);
            }
            System.out.println("for문 끝");
        }
    }
}
