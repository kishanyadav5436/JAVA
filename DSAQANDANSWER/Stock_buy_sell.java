import java.util.Scanner;

public class Stock_buy_sell {
  public static int maxProfit(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice; // today's profit
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int prices[] = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
      prices[i] = sc.nextInt();
    }
    System.out.println("Maximum profit: " + maxProfit(prices));
  }
}
