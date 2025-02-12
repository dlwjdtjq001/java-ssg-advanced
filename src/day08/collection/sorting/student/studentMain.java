package day08.collection.sorting.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        List<Student> data = new ArrayList<>();

        data.add(studentService.createStudent("오나라",studentService.createScores(99,99,99)));
        data.add(studentService.createStudent("홍길동",studentService.createScores(54,65,53)));
        data.add(studentService.createStudent("김선달",studentService.createScores(43,53,94)));
        data.add(studentService.createStudent("강낭콩",studentService.createScores(43,53,68)));
        data.add(studentService.createStudent("곽두식",studentService.createScores(43,53,88)));


        System.out.println("1번 : 수학정렬 / 2번: 영어정렬 / 3번: 과학정렬 / 4번:총점정렬 / 5번: 랭킹출력");
        int menu = scanner.nextInt();

        switch (menu){
            case 1:
                System.out.println("수학 정렬");
                studentService.sortMath(data);
                break;
            case 2:
                System.out.println("영어 정렬");
                studentService.sortEng(data);
                break;
            case 3:
                System.out.println("과학 정렬");
                studentService.sortSci(data);
                break;
            case 4:
                System.out.println("총점 정렬");
                studentService.sortTotal(data);
                break;
            case 5:
                System.out.println("랭킹 출력");
                Map<Integer,Student> rankMap = studentService.createRankMap(data);
                rankMap.entrySet().stream().forEach(x -> System.out.println(x.getKey() + "등 : " + x.getValue().getName() ));
                break;
        }

    }
}
