package stacks;

public class StackFunc {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public StackFunc(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
}
