package day07.genericEx.classGeneric;

public class Box<T> { // T 는 Box의 인스턴스를 생성할떄 어떤 참조타임으로 대체될 수 있는 타임매개변수
    private T item;
    private int count = 0;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
