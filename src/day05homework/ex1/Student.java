package day05homework.ex1;

public class Student {

    private String id;
    private String name;
    private String major;

    private String grade;
    private String phoneNumberr;
    private String address;

    private Student(StuBuilder stuBuilder){
        id = stuBuilder.id;
        name = stuBuilder.name;
        major = stuBuilder.major;
        grade = stuBuilder.grade;
        phoneNumberr = stuBuilder.phoneNumber;
        address = stuBuilder.address;
    }

    static class StuBuilder{
        private String id;
        private String name;
        private String major;

        private String grade;
        private String phoneNumber;
        private String address;

        public StuBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StuBuilder addGrade(String grade){
            this.grade = grade;
            return this;
        }
        public StuBuilder addPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public StuBuilder addAddress(String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", Grade='" + grade + '\'' +
                ", phoneNumberr='" + phoneNumberr + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
