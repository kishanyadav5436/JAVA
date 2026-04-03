public class Binary {
  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    int f[] = { 60, 50, 30, 55, 80 };
    for (int n : f) {
      bt.root = bt.insert(bt.root, n);
    }
    System.out.println("Preorder traversal:");
    bt.preorder(bt.root);
    System.out.println("\nInorder traversal:");
    bt.inorder(bt.root);
    System.out.println("\nPostorder traversal:");
    bt.postorder(bt.root);
  }

}

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  Node insert(Node node, int value) {
    if (node == null) {
      return new Node(value);
    }
    if (value < node.data) {
      node.left = insert(node.left, value);
    } else if (value > node.data) {
      node.right = insert(node.right, value);
    }
    return node;
  }

  void preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + "->");
    preorder(node.left);
    preorder(node.right);

  }

  void inorder(Node node) {
    if (node == null)
      return;
    inorder(node.left);
    System.out.print(node.data + "->");
    inorder(node.right);
  }

  void postorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + "->");
    preorder(node.right);
    preorder(node.left);

  }
}