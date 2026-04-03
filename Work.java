import java.util.Scanner;

public class Work {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = Sc.nextInt();
    System.out.println("Print the Table:");
    for (int i = 1; i <= 10; i++) {
    System.out.println(a + "x" + i + "=" + (a * i));
    }
    System.out.println("Enter a number :");
    int b=Sc.nextInt();
    int r=0;
    while (b!=0) {
      int d=b%10;
      r=r*10+d;
      b=b/10;
    }
    System.out.println("Reversed num:"+r);
    System.out.println("Check the number is Palidrome or not");
    int c=Sc.nextInt();
    
  }


}
