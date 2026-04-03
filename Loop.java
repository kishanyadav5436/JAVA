import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    /*
     * if (n > 0) {
     * System.out.println("Postive");
     * } else {
     * System.out.println("Negative");
     * }
     * for (int i = 1; i <= n; i++) {
     * System.out.println(i);
     * }
     * switch (n) {
     * case 1:
     * System.out.println("SUNDAY");
     * break;
     * case 2:
     * System.out.println("MONDAY");
     * break;
     * case 3:
     * System.out.println("TUESDAY");
     * break;
     * case 4:
     * System.out.println("WEDNESDAY");
     * break;
     * case 5:
     * System.out.println("THURSDAY");
     * break;
     * case 6:
     * System.out.println("FRIDAY");
     * break;
     * case 7:
     * System.out.println("SATURDAY");
     * break;
     * default:
     * 
     * System.out.println("Invalid day");
     */
    if (n <= 0) {
      System.out.println("Invalid input");
    } else {
      for (int i = 1; i <= n; i++) {
        System.out.println(i);
      }
      double sum = 0;
      int i = 1;
      while (i <= n) {
        if (i % 2 == 0) {
          sum += i;
        }
        i++;
      }
      System.out.println("Sum: " + sum);
      int k = 1;
      do {
        System.out.println(k + "*" + n + "=" + (k * n));
        k++;
      } while (k <= 10);
      int Choice = scanner.nextInt();
      switch (Choice) {
        case 1:
          boolean isPrime = true;
          for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
              isPrime = false;
              break;
            }
          }
          if (isPrime) {
            System.out.println("Prime");
          } else {
            System.out.println("Not Prime");
          }
          break;

        case 2:
          if (n % 2 == 0) {
            System.out.println("Even");
          } else {
            System.out.println("Odd");
          }
          break;

        default:
          System.out.println("Invalid case");

      }
      System.out.println("Exiting...");
    }
  }
}
