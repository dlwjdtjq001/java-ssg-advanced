package day07.collection.linkedlistImpl;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<>();
        myLinkedList.addNode(1);
        System.out.println(myLinkedList.head.data);
        myLinkedList.addNode(2);
        System.out.println(myLinkedList.head.next.data);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
    }


}
