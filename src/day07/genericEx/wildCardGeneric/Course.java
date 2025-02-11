package day07.genericEx.wildCardGeneric;

public class Course {

    //  Person 이면 수강등록 가능
    public static void registweCourse(Application<?> application){
        System.out.println(application.getKind());
    }

    //  학생만 등록 가능
    public static void registerCourse2(Application<? extends Student> applicant){
        System.out.println(applicant.getKind());
    }

    //직장인 및 일반인 등록가능
    public static void registerCourse3(Application<? super Student> applicant){
        System.out.println(applicant.getKind());
    }


}
