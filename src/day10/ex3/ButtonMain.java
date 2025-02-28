package day10.ex3;

public class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(() -> System.out.println("버튼이 클릭되었습니다."));

        button.click();

        button.setClickListener(util::cancel);

        button.click();;
    }

    static class util{
        static void cancel(){
            System.out.println("눌러서 취소되었습니다.");
        }
    }
}


