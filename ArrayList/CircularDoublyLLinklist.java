
class Node {
  int data;
  Node next;
  Node prev;

  Node(int data) {
    this.data = data;
    prev = next = null;
  }
}

class CircularDoublyLL {
  Node head;

  void insert(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      head.prev = head;
      head.next = head;
      return;
    }
    Node last = head.prev;
    newnode.prev = last;
    newnode.next = head;
    head.prev = newnode;
    last.next = newnode;
    head = newnode;
  }

  void display() {
    if (head == null) {
      return;
    }
    Node curr = head;
    do {
      System.out.print(curr.data + "->");
      curr = curr.next;
    } while (curr != head);
    System.out.println("HEAD");

  }

  boolean hasCycle() {
    if (head == null) {
      return false;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

}

public class CircularDoublyLLinklist {
  public static void main(String[] args) {
    CircularDoublyLL cdll = new CircularDoublyLL();
    cdll.insert(50);
    cdll.insert(40);
    cdll.insert(30);
    cdll.insert(20);
    cdll.insert(10);
    cdll.display();

    System.out.println("Has cycle: " + cdll.hasCycle());
  }
}
