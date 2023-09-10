package doublyLL;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //creating an instance 
        DLLfunc myDlLfunc = new DLLfunc(2);

        //appending a node
        myDlLfunc.append(4);
        myDlLfunc.append(6);

        //removing last node
        myDlLfunc.removeLast();

        //prepending a node
        myDlLfunc.prepend(1);

        //removing first node
        // myDlLfunc.removeFirst();

        //getting length
        myDlLfunc.getLength();
        //printing doublyLinked List
        myDlLfunc.printL();

        //getting head
        myDlLfunc.getHead();
        //getting tail
        myDlLfunc.getTail();

        //get a node by index
        System.out.println(myDlLfunc.get(1).value);

        //setting [changing] value for a node
        myDlLfunc.set(0, 10);

        //inserting a node at index
        myDlLfunc.insert(2, 19);

        //printing doublyLinked List
        myDlLfunc.printL();
    }
}
