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

    //getting head of doublyLinked list
    public void getHead(){
        System.out.println("Head : "+ head.value);
    }

    //getting tail of doublyLinked list
    public void getTail(){
        System.out.println("Tail : "+ tail.value);
    }

    //getting length of doublyLinked list
    public void getLength(){
        System.out.println("Length : "+ length);
    }

    //printing doubly Linked List
    public void printL(){
        Node temp = head;
        while(temp != null){
            System.out.print( "-> "+temp.value +" ");
            temp = temp.next;
        }
    }

    //Appending a node in a doubly linked list
    public void append(int value){
        //creating newNode
        Node newNode = new Node (value);
        if(length==0){
            //inserting the first element into the LinkedList
            head = newNode;
            tail = newNode;
        }
        else{
            //inserting at last position
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //removing a node from last
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;

        //again checking length [whatif length was 1]
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }
}
