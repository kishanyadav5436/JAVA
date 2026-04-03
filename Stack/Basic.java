
class StackNode {
  int data;
  StackNode next;

  StackNode(int data) {
    this.data = data;
    next = null;
  }
}

class MyStack {
  StackNode top;

  void push(int data) {
    StackNode newnode = new StackNode(data);
    newnode.next = top;
    top = newnode;
  }

  int pop() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    }
    int value = top.data;
    top = top.next;
    return value;
  }

  int peek() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    }
    return top.data;

  }

  boolean isEmpty() {
    return top == null;

  }
}

public class Basic {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Top element:" + stack.peek());
    stack.pop();
    System.out.println("Top element after pop:" + stack.peek());
    System.out.println("Is empty:" + stack.isEmpty());
  }

}
