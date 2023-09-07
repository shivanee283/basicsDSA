package doublyLL;

public class DLLfunc {
    //creating head and tail pointer. Both of type NODE so that they can point. 
    //Making it private because it is best practice.
    private Node head;
    private Node tail;
    private int length;

    //declaring a class Node {value and point}
    class Node{
        Node prev;
        int value;
        Node next;

        //declaring a Node constructor 
        Node(int value){
            this.value = value;
        }
    }
    //declaring a SLLfunc constructor
    public DLLfunc(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

}
