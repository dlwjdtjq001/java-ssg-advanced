package day09.linked;

public class Main {
    public static void main(String[] args) {
        NodeMgmt mytree = new NodeMgmt();
        mytree.insertNode(1);
        mytree.insertNode(11);
        mytree.insertNode(3);
        mytree.insertNode(73);
        mytree.insertNode(6);
        mytree.insertNode(7);
        mytree.insertNode(9);
        mytree.insertNode(84);
        mytree.insertNode(17);
        mytree.insertNode(95);
        System.out.println(mytree.search(1));
    }


}
