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

        //removing first node;
        mySlLfunc.removeFirst();

        //getting the length of LinkedList
        mySlLfunc.getLength();

        //getting a node by index
        System.out.println("Node is : " + mySlLfunc.get(2).value + " ");

        //setting a node
        mySlLfunc.set(1, 40);

        System.out.print("Singly Linked List is : ");
        //printing the LinkedList
        mySlLfunc.printSll();

        // inserting a node wherever i want
        mySlLfunc.insert(0, 100);

        // removing a node from wherever i want
        mySlLfunc.remove(0);

        System.out.println();
        System.out.print("Singly Linked List is : ");
        //printing the LinkedList
        mySlLfunc.printSll();
    }
}
