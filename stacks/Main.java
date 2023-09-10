package stacks;

public class Main {
    public static void main(String[] args) {
        StackFunc myStackFunc = new StackFunc(9);

        //pushing into stack
        myStackFunc.push(10);
        myStackFunc.push(11);
        myStackFunc.push(12);
        myStackFunc.push(13);

        //poping from stack
        myStackFunc.pop();

        //printing stack
        myStackFunc.printStack();
    }
}
