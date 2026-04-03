public class Strinbluider {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append("World");
    System.out.println("After append:" + sb);
    sb.insert(5, "java");
    System.out.println("After insert:" + sb);
    sb.delete(1, 4);
    System.out.println("After delete:" + sb);
    sb.reverse();
    System.out.println("After reverse:" + sb);

  }

}
