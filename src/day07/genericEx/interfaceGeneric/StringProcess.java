package day07.genericEx.interfaceGeneric;

public class StringProcess implements Processor<String> {
    @Override
    public void process(String input) {
        System.out.println("processing : " + input);
    }
}
