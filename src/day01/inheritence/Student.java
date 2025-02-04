package day01.inheritence;

public class Student extends Manager {
//  봉인 풀지 않음. sealed , 그걸 상속한 employee 도 봉인 풀지 않았기 떄문에 상속 불가.
//   봉인 해제된 manager클래스는 상속 가능

    @Override
    public void work() {
        System.out.println("매니저만큼 일함");
    }
}
