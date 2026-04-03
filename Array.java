import java.util.*;
public class Array {
  //linear Search
/*static  int find(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }
  //reverse 
  static  void reverse(int[] arr) {
    for (int r = arr.length-1; r< arr.length; r--) {
      int temp = arr[r];
      
    }*/

  

  public static void main(String[] args) {
    //deleration and creation
   /*  int []a;//declaration
    a=new int[5];
    int b[]={1,2,3,4,5};
    String c[]=new String[5];
    //length & alteration
    int n=b.length;
    for(int i=0;i<n;i++){
      System.out.println(b[i]);

    }
    for(int val:b){
      System.out.println(val);
   
      }
     int arr []={5,2,9,1,5};
     Arrays.sort(arr); 
     System.out.println("Stored array:"+Arrays.toString(arr));
     int pos=Arrays.binarySearch(arr, 5);
     System.out.println("Position of 5 in the sorted array:"+pos);*/
   // Array Copy
   int src[]={1,2,3,4,5};
   int []first3=java.util.Arrays.copyOf(src, 3);

   int []mid=java.util.Arrays.copyOfRange(src, 1, 4);
   System.out.println("Orignal src array :"+java.util.Arrays.toString(src));
   System.out.println("First 3 elements:"+java.util.Arrays.toString(first3));
   System.out.println("Mid:"+java.util.Arrays.toString(mid));
  }
}