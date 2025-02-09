package day05homework.ex1;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student.StuBuilder("dd", "이정섭" , "컴공")
                .addAddress("서울시 노원구")
                .addGrade("A")
                .addPhoneNumber("01012341234")
                .build();

        Student student1 = new Student.StuBuilder("ㅁㄴㅇ", "홍길동" , "소공")
                .addAddress("서울시 노원구 ㅋㅋ")
                .addGrade("B")
                .addPhoneNumber("01012341234")
                .build();
//                .build();

        System.out.println(student);
        System.out.println(student1);
    }
}
