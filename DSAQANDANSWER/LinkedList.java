public class LinkedList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    // s1 create new node
    size++;
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;

    }

    // s2 newnode next=head
    newNode.next = head;// link

    // s3 head=newnode
    head = newNode;

  }

  public void addLast(int data) {
    size++;
    Node newnNode = new Node(data);
    if (head == null) {
      head = tail = newnNode;
      return;
    }
    tail.next = newnNode;
    tail = newnNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("Link is empty:");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "--> ");
      temp = temp.next;

    }
    System.out.println("null");
  }

  // insert a data any index
  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;

    }
    size++;
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;

    }
    // i=idx-1; temp->preve
    newNode.next = temp.next;
    temp.next = newNode;
    i++;
  }

  public int removeFirst() {

    if (size == 0) {
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;

  }

  public int remove_last() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    // preve : i=size-2
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;

    }
    int val = prev.next.data;// tail data
    prev.next = null;
    tail = prev;
    size--;
    return val;

  }

  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    // key not found
    return -1;
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;

    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;

    }
    return idx + 1;
  }

  public int RecSearch(int key) {
    return helper(head, key);

  }
  public void deleteNthFromEND(int n){
    //calc sie
    int sz=0;
    Node temp=head;
    while( temp!=null){
      temp =temp.next;
      sz++;
    }
    if(n==sz){
      head=head.next;
      return;
    }
 //sz-1
 int i=1;
 int itoFind=sz-n;
 Node prev=head;
while(i<itoFind){
  prev=prev.next;
  i++;
}
prev.next=prev.next.next;
return;
  }
  public boolean isCycle(){
    Node slow=head;
    Node fast=head;
    while (fast !=null && fast.next!=null) {
      slow=slow.next;
     fast=fast.next.next;
     if(slow==fast){
      return true;

     }

      
    }
    return false;
  }
  public static void removeCycle(){
    //detect cycle
    Node slow =head;
    Node fast=head;
    boolean cycle=false;
while (fast !=null && fast.next!=null) {
      slow=slow.next;
     fast=fast.next.next;
     if(slow==fast){
       cycle =true;
       break;

     }   
    }
    if(cycle==false){
      return;
    }
    slow=head;
    Node prev=null;
    while (slow!=fast) {
      prev =fast;
      slow=slow.next;
      fast=fast.next;
      
    }
    prev.next=null;
  }

  public static void main(String[] args) {
    LinkedList lik = new LinkedList();
    lik.addFirst(2);

    lik.addFirst(5);

    lik.addFirst(10);

    lik.addLast(5);
    lik.add(2, 7);

    lik.addLast(8);
    lik.print();

    System.out.println(lik.removeFirst());
    lik.print();

    // System.out.println(lik.size);
  }
}