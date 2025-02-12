package day08.collection.sorting.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    public Student createStudent(String name, List<Integer> score){
        int total = score.stream().mapToInt(x -> Integer.valueOf(x)).sum();
        double average = (double) total /3;
        Student student = new Student.StudentBuilder()
                .name(name)
                .mathScore(score.get(0))
                .engScore(score.get(1))
                .sciScore(score.get(2))
                .totalScore(total)
                .averageScore(average)
                .build();
        return student;
    }

    public List createScores(Integer mathScore, Integer engScore, Integer sciScore){
        ArrayList<Integer> scores = new ArrayList();
        scores.add(mathScore);
        scores.add(engScore);
        scores.add(sciScore);
        return scores;
    }

    public void sortTotal(List<Student> data){
        data.sort((a,b) -> {
            return -(a.getTotalScore()-b.getTotalScore());
        });
        data.forEach(System.out::println);
    }

    public void sortMath(List<Student> data){
        data.sort((a,b) -> {
            return -(a.getMathScore()-b.getMathScore());
        });
        data.forEach(System.out::println);
    }

    public void sortEng(List<Student> data){
        data.sort((a,b) -> {
            return -(a.getEngScore()-b.getEngScore());
        });
        data.forEach(System.out::println);
    }

    public void sortSci(List<Student> data){
        data.sort((a,b) -> {
            return -(a.getSciScore()-b.getSciScore());
        });
        data.forEach(System.out::println);
    }

    public Map<Integer,Student> createRankMap(List<Student> data){
        Map<Integer, Student> rankNameMap = new HashMap<>();
        sortTotal(data);
        int rank = 1;
        for(Student student : data){
            rankNameMap.put(rank,student);
            rank++;
        }
        return rankNameMap;

    }



}
