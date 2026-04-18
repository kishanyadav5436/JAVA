import java.util.*;
class BlancedBST {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + "->");
    preorder(root.left);
    preorder(root.right);
  }

  public static void inorderSe(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }
    inorderSe(root.left,inorder);
    inorder.add(root.data);
    inorderSe(root.right,inorder);
  }

  public static Node createBlancedBST(int arr[], int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(arr[mid]);
    root.left = createBlancedBST(arr, start, mid - 1);
    root.right = createBlancedBST(arr, mid + 1, end);
    return root;

  }
   public static Node createBlancedST(ArrayList<Integer> inorder, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(inorder.get(mid));
    root.left = createBlancedST(inorder, start, mid - 1);
    root.right = createBlancedST(inorder, mid + 1, end);
    return root;

  }
  public static Node BalancedBS(Node root){
    ArrayList<Integer> inorder=new ArrayList<>();
    inorderSe(root, inorder);
    root=createBlancedST(inorder, 0, inorder.size()-1);
    return root;



  }

  public static void main(String[] args) {

    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);
    
    root= BalancedBS(root);
    preorder(root);

    // int arr[]={ 3,5,6,8,10,11,12};
    // Node root=createBlancedBST(arr, 0, arr.length-1);
    // preorder(root);

  }

}
