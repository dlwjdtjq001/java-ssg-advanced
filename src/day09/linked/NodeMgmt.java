package day09.linked;

//1. Node 생성 => Root
//2. BST에 데이터 넣은 기능 구현
public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return " 자식 왼쪽| " + value + " |" +
                    " -값-: " + value + " |" +
                    " 자식 오른쪽: " + right + " |";
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else { //CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }

                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때

                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }

                }

            }

        }
        return true;
    }

    public Node search(int data){
        if(this.head == null) return null;
        else{
            Node findNode = this.head;
            while(findNode != null){
                if(findNode.value == data){
                    return findNode;
                }else if(data < findNode.value){
                    findNode = findNode.left;
                }else findNode = findNode.right;
            }return findNode;
        }
    }
}









