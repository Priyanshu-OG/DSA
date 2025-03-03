package BinaryTree;

public class HeightOfBT {
    Node root;
    HeightOfBT(){
        root = null;
    }
    int height(Node node){
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        HeightOfBT tree = new HeightOfBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Height of binary tree is: " + tree.height(tree.root));
    }
}
