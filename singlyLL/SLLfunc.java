package singlyLL;

public class SLLfunc {
    //creating head and tail pointer. Both of type NODE so that they can point. 
    //Making it private because it is best practice.
    private Node head;
    private Node tail;
    private int length;

    //declaring a class Node {value and point}
    class Node{
        int value;
        Node next = null; //doesn't matter if null isn't specified

        //declaring a Node constructor 
        Node(int value){
            this.value = value;
        }
    }
    //declaring a SLLfunc constructor
    public SLLfunc(int value){
        //creating a new Node 
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Method to print the singly linked list
    public void printSll(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    //Method to get the head of the LinkedList
    public void getHead(){
        System.out.println("Head : "+ head.value);
    }

    //Method to get the tail of the LinkedList
    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }

    //Method to get the length of the LinkedList
    public void getLength(){
        System.out.println("Length : "+ length);
    }
    //method for adding node at front (head)
}
