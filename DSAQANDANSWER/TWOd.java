import java.util.Scanner;

public class TWOd {
  public static boolean Search(int arr[][],int key) {
        for (int i = 0; i < arr.length; i++) {
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j]==key){
        System.out.print("Elements found at index:" +"("+ i+ ","+j+")");
        return true;}
      }
      System.out.println();
    }
    System.out.println("Elements not found");  
      return false;

  }
  public static void Largest_smallest(int arr[][]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j]>max){
          max=arr[i][j];
        }
        if(arr[i][j]<min){
          min=arr[i][j];
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter THe Key :");
    int key= sc.nextInt();
    System.out.println("Enter the dimensions:");
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println("Enter the input:");
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for(int j=0; j<m; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Print th out put:");
    for (int i = 0; i < n; i++) {
      for(int j=0; j<m; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    Search(arr, key);
  }

}