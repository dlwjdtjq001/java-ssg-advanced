package day07.genericEx.wildCardGeneric;

public class Application <T>{
    private T kind;

    public Application(T kind) {
        this.kind = kind;

    }

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }
}
