package queues;

public class QueueFunc {
    private Node front;
    private Node rear;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public QueueFunc(int value){
        Node newNode = new Node(value);
        front = newNode;
        rear = newNode;
        length = 1;
    }

    //method to get front of Queue
    public Node getFront(){
        return front;
    }

    //method to get rear of Queue
    public Node getRear(){
        return rear;
    }

    //method to get no. of element
    public int getLength(){
        return length;
    }

    //method to print the Queue;
    public void printQueue(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Enqueue method
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length==0){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    //Dequeue method
    public Node dequeue(){
        if(length==0){
            return null;
        }
        Node temp = front;
        if(length==1){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
