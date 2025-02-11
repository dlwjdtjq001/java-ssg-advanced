package day07homework;
//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GennericMethodEx {
    public<T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}
