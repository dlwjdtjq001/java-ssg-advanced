package day01.inheritence;

public class Main {
    public static void main(String[] args) {
        sealedEx person = new sealedEx();
        Employee employee = new Employee();
        Manager manager = new Manager();
        Student student = new Student();

        person.work();
        employee.work();
        manager.work();
        student.work();
    }
}
