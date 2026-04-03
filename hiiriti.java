public class hiiriti {
  public static void PrintHelllowRectangle(int row, int column) {

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= column-1; j++) {
        System.out.print(" ");}
        for(int j=1; j<=i; j++){
           System.out.print(" *");
        }

      System.out.println();
    }

  }

  public static void main(String[] args) {
    PrintHelllowRectangle(4, 4);

  }

}
