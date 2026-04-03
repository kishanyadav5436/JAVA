import java.util.*;
//Binar tree serch using bfs

public class BFS {
  static class Node {
    int data;
    Node left, right;

    Node(int item) {
      data = item;
      left = right = null;
    }
  }

  Node root;

  void printLevelOrder() {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node tempNode = queue.poll();
      System.out.print(tempNode.data + " ");

      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }

      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }

  public static void main(String args[]) {
    BFS tree = new BFS();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println("Level order traversal of binary tree is - ");
    tree.printLevelOrder();
  }
  
}
