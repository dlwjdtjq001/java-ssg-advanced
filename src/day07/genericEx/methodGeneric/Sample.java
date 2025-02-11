package day07.genericEx.methodGeneric;

public class Sample {
    public static <T> void printValue(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        printValue("HelloWorld");
        printValue(12345);
    }
}
