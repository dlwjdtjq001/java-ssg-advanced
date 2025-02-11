package day07homework;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
public class Box <T>{
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean isOfType(Class<?> clazz){
        return clazz.isInstance(element);
    }
}
