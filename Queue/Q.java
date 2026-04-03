
import java.util.LinkedList;
import java.util.Queue;

public class Q {
  public static void main(String[] args) {
    int n = 5;
    Queue<String> q = new LinkedList<>();
    q.add("1");
    System.out.println("First:" + n + ":Binary Numbers:");
    for (int i = 0; i < n; i++) {
      String curr = q.remove();
      System.out.println(curr + "");
      q.add(curr + "0");
      q.add(curr + "1");
    }

  }

}
