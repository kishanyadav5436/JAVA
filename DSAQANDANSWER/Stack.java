import java.util.ArrayList;

public class Stack { // Ideally rename this to MyStack
    // static class Stac {
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     // push
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     // pop
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     // peek
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }
    //}
    //linklist
    static class Node{
      int data;
      Node next;
      Node(int data){
        this.data=data;
        this.next=null;
      }
    }
    static class Stac{
      static Node head=null;

      public static boolean isEmpty(){
        return head==null;
      }
      //push
      public static void push(int data){
        Node newNode =new Node(data);

        if(isEmpty()){
          head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;
      }


      //pop
      public static int pop(){
        if(isEmpty()){
          return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

      }
      //peek
      public static int peek(){
        if (isEmpty()) {
          return -1
          
        }
        return head.data;
      }
    }

    public static void main(String[] args) {
        // Access methods via the inner class name 'Stac'
        Stac.push(1);
        Stac.push(2);
        
        System.out.println("Peek: " + Stac.peek()); // Output: 2
        System.out.println("Pop: " + Stac.pop());   // Output: 2
        System.out.println("IsEmpty: " + Stac.isEmpty()); // Output: false
    }
}