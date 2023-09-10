package doublyLL;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //creating an instance 
        DLLfunc myDlLfunc = new DLLfunc(2);

        //getting head
        myDlLfunc.getHead();
        //getting tail
        myDlLfunc.getTail();
        

        //appending a node
        myDlLfunc.append(4);
        myDlLfunc.append(6);

        //removing last node
        myDlLfunc.removeLast();

        //getting length
        myDlLfunc.getLength();
        //printing doublyLinked List
        myDlLfunc.printL();
    }
}
