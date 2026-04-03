import java.util.Scanner;

class QustioONE{
  public static void CheckDuplicate(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          System.out.println("True");
          return;
        }
      }
    }
    System.out.println("False");
  }

  public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    System.out.println("Enter the size of element :");
    int n= Sc.nextInt();
    int nums[]=new int[n];
    System.out.println("Enter the element :");
    for(int i=0; i<nums.length; i++){
      nums[i]=Sc.nextInt();
    }

    CheckDuplicate(nums);
  
  
  }

}