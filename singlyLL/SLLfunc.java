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
            System.out.print(temp.value + " ");
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


    //Method to add a node from last {Append}
    public void append(int value){
        //creating a new Node with given input
        Node newNode = new Node(value);
        //checking whether there is only one element in LL or not, then we have to change both head & tail accordingly
        //checking for empty Linked List
        if(length == 0 ){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Method to remove last Node from singly LinkedList {removeLast}
    public Node removeLast(){
        //check if there is any Node or not
        if(length == 0){
            return null;
        }
        // initialising a temp Node pointing to Head;
        Node temp = head;
        Node pre = temp;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        pre.next = null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //adding a node from front {prepend}
    public void prepend(int value){
        //creating a newNode;
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next=head;
            head = newNode;
        }
        length++;
    }

    //removing first node from singly linked list
    public Node removeFirst(){
        //chekcing if there are any elements
        if(length==0){
            System.out.println("List Empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        
        //again checking [whatif earlier length was 1]
        if(length ==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //get method - to get a node 
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
    
    //set method - to set value of a node
    public boolean set(int index, int value){
        //check if the given index is valid
        Node temp = get(index); //checked automatically;
        //check if temp is null or not;
        if(temp!=null){
            temp.value = value;//this will change only data and next pointer
            return true;
        }
        return false; //couldn't
    }

    //Method to insert a node where wanted
    public boolean insert(int index, int value){
        Node newNode = new Node(value);
        //checking if there are any nodes persent 
        // if(length == 0){
        //     newNode = head;
        //     newNode = tail;
        // }

        //Checking 
        if(index<0 || index>length){
            System.out.println("out of bound");
            return false;
        }
        else if(index ==0){
            prepend(value);
            return true;
        }
        else if(index == length){
            append(value);
            return true;
        }
        else{
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }
}
