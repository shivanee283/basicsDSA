package trees;

public class Main {
    public static void main(String[] args) {
        TreeFunc mTreeFunc = new TreeFunc();

        //inserting a node in Tree
        mTreeFunc.insert(10);
        mTreeFunc.insert(25);

        System.out.println("root "+ mTreeFunc.root.value);
    }
}
