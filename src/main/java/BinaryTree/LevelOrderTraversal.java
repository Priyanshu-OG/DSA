package BinaryTree;
import java.util.*;
public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Level order traversal of binary tree is: ");
        printLevelOrder(root);
    }
    static void printLevelOrder(Node root){
       Queue<Node> queue = new LinkedList<Node>();
         queue.add(root);
         List<List<Integer>> result = new ArrayList<>();
            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> currentLevel = new ArrayList<>();
                for(int i = 0; i < size; i++){
                    Node current = queue.remove();
                    currentLevel.add(current.data);
                    if(current.left != null){
                        queue.add(current.left);
                    }
                    if(current.right != null){
                        queue.add(current.right);
                    }
                }
                result.add(currentLevel);
            }
            System.out.println(result);
    }
}
