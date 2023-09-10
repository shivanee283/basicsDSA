package trees;

public class TreeFunc {
    Node root; //can keep this private or don't
    //keeping this private will make it non accessible from other file. so making it public 

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    //method to insert a node in the tree
    public boolean insert(int value){
        Node newNode = new Node(value);
        //if there is no nodes then we can add any node as root and that's why returning true
        if(root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value){
                return false;
            }
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
}
