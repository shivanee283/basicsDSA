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
            System.out.print(" "+temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println();
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

    //prepending a node in doublyLinked List
    public void prepend(int value){
        //creating a node 
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    //removing the first node
    public Node removeFirst(){
        if(length == 0){
            System.out.println("Doubly LL is empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;

        //checking length again [whatif length is 1]
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //get method for doublyLinked List
    public Node get(int index){
        //checking if index is less than 0 or greater than length [wrong]
        if(index<0 || index > length){
            return null;
        }

        //initialiing a node
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //set method for doublyLinked List
    public boolean set(int index, int value){
        //checking if index is less than zero and greater than length of list[wrong]
        Node temp = get(index); //checks automatically

        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //insert a node anywhere in doublyLinked list
    public boolean insert(int index, int value){
        if(index<0 || index>length){
            return false;
        }
        if(length==0){
            prepend(value);
            return true;
        }
        else if(index==length){
            append(value);
            return true;
        }
        else{
            Node newNode = new Node(value);
            Node temp = get(index-1);
            temp.next.prev = newNode;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            length++;
            return true;
        }
    }

    //removing a node from a given index
    public Node remove(int index){
        if(index<0 || index>=length){
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        else if(index==length-1){
            return removeLast();
        }
        else{
            Node temp = get(index);
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
    }
}
