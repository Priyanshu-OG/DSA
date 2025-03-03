package BinaryTree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class DFS_Traversal {
    Node root;
    DFS_Traversal(){
        root = null;
    }
    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        DFS_Traversal tree = new DFS_Traversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Preorder traversal of binary tree is: ");
        tree.preOrder(tree.root);
        System.out.println("\nInorder traversal of binary tree is: ");
        tree.inOrder(tree.root);
        System.out.println("\nPostorder traversal of binary tree is: ");
        tree.postOrder(tree.root);
    }
}
