public class A {
  static void reverse(int arr[]){
    for (int i = 0, r = arr.length - 1; i < r; i++, r--) {
      int temp = arr[i];
      arr[i] = arr[r];
      arr[r] = temp;
    }
    
  }
  
  public static void main(String[] args) {
    
    int arr[]={10,40,80,90,100,20};
    for(int num:arr){
      System.out.println(num+"");
    }
    System.out.println();
    reverse(arr);
    System.out.println("reversed array:");
    for (int num : arr) {
      System.out.println(num + "");
    }
  }
}
