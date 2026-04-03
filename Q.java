import java.util.Scanner;

public class Q {
  static void PrintTable(int n) {
    for (int j = 1; j <= 10; j++) {
      System.out.println(j + " * " + n + " = " + (j * n));
    }
   // int i = 1;
    //do {
    //  System.out.println(i + "*" + n + "=" + (i * n));
    //  i++;
   // } while (i <= 10);
  }

  public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=Sc.nextInt();
    PrintTable(n);
  
  }

}
