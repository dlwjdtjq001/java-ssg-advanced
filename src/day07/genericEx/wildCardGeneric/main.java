package day07.genericEx.wildCardGeneric;

public class main {
    public static void main(String[] args) {
        //모든 사람이 시청 가능
        Course.registweCourse((new Application<Person>(new Person())));
        Course.registweCourse((new Application<Worker>(new Worker())));
        Course.registweCourse((new Application<HighSchool>(new HighSchool())));
//        Course.registweCourse((new Application<MiddleSchool>(new MiddleSchool())));

        //학생만 신청 가능

        Course.registweCourse((new Application<HighSchool>(new HighSchool())));

        // 직장인 일반인 가능
//        Course.registerCourse3(new Application<Worker>(new Worker()));

    }
}
