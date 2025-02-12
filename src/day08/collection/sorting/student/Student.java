package day08.collection.sorting.student;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Student {
    private String name;
    private int mathScore;
    private int engScore;
    private int sciScore;
    private int totalScore;
    private double averageScore;

    @Override
    public String toString() {
        return name +
                " 수학: " + mathScore +
                " 영어: " + engScore +
                " 과학: " + sciScore +
                " 총점: " + totalScore +
                " 평균: " + (int)averageScore;
    }
}
