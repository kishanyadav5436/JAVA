import java.util.Arrays;

public class ArrayKIs {
  // LinearSearch
  public static int LS(int arr[], int target) {
    for (int i = 0; i <= arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // Largest number
  public static int La(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i])
        largest = arr[i];

    }
    return largest;
  }

  public static int BS(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] < key) {
        start = mid + 1;
      } else {
        start = mid - 1;
      }
    }

    return -1;
  }

  // reverse
  public static void reverse(int arr[]) {
    int kis[] = new int[arr.length];
    int j = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      kis[j] = arr[i];
      j++;
    }
    System.out.print(Arrays.toString(kis));
  }

  public static void rev(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      start++;
      end--;

    }
  }

  public static void Pair(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println(curr + " " + arr[j]);
      }
    }
  }

  // sub array
  public static void subArray(int arr[]) {
    int minSUM=Integer.MAX_VALUE;
    int maxSUM=Integer.MIN_VALUE;
 
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
           int sum = 0;
        for (int k = start; k <= end; k++) {
          System.out.print(arr[k] + " ");

          sum = sum + arr[k];
         
        }
        System.out.print("="+sum);
        if(minSUM>sum){
          minSUM=sum;
        }
        if(maxSUM<sum){
          maxSUM=sum;
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println(minSUM);
    System.out.println(maxSUM);
  }


  public static void main(String args[]) {
    int arr[] = { 6, 7, 8, 9 };
    int key = 12;
    // int target = 9;
    // int index =LS(arr, target);
    // if(index==-1){xc
    // System.out.println("Element not found in the array");
    // }else{
    // System.out.println("Element is :"+ index);
    // }
    // stem.out.println("larges bvjsijswieval aiudhmxui:"+ La(arr));
    // stem.out.println("Index for key is:"+ BS(arr, key));
    // rev(arr);
    // for(int i=0; i<=arr.length; i++){
    // System.out.println(arr[i]+" ");
    // }
    // System.out.println(arr.length);
    // }
    // Pair(arr);

    subArray(arr);

  }
}
