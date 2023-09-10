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

    //Push method in stacks
    //condtion -- if full, cant push 
    //full when top == height
    //empty when height == 0
    public void push(int value){
        //creating a newNode;
        Node newNode = new Node(value);//create node with the given value
        if(height==0){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    //method to pop elements from stack
    public Node pop(){
        if(height==0){
            System.out.println("cannot pop, stack empty");
            return null;
        }
        else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }

    //method to print the stack;
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }

    //method to get top of stack;
    public Node getTop(){
        return top;
    }

    //method to get Height of the stack
    public int getHeight(){
        return height;
    }
}
