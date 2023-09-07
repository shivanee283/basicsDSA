package singlyLL;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // creating a instance of the Single Linked List
        SLLfunc mySlLfunc = new SLLfunc(1);

        //getting head value;
        mySlLfunc.getHead();
        //getting the tail value;
        mySlLfunc.getTail();
        

        //appending a node
        mySlLfunc.append(2);
        mySlLfunc.append(3);
        mySlLfunc.append(4);
        mySlLfunc.append(5);
        // mySlLfunc.append(5);

        //removing from last;
        mySlLfunc.removeLast();

        //prepending a value
        mySlLfunc.prepend(90);

        //getting the length of LinkedList
        mySlLfunc.getLength();

        System.out.print("Singly Linked List is : ");
        //printing the LinkedList
        mySlLfunc.printSll();
    }
}
