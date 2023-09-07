package singlyLL;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // creating a instance of the Single Linked List
        SLLfunc mySlLfunc = new SLLfunc(4);

        //getting head value;
        mySlLfunc.getHead();
        //getting the tail value;
        mySlLfunc.getTail();
        //getting the length of LinkedList
        mySlLfunc.getLength();
        //printing the LinkedList
        mySlLfunc.printSll();
    }
}
