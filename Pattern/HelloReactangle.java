public class HelloReactangle {
  public static void PrintRect(int row, int col) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (i == 1 || j == 1 || row == i || col == j) {
          System.err.print("*");
        } else {
          System.err.print(" ");
        }

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    PrintRect(4, 5);

  }
}