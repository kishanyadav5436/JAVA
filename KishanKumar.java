import java.util.Arrays;

public class KishanKumar {
  static boolean isSorted(int arr[]) {
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] < arr[j - 1])
        return false;
    }
    return true;

  }

  static void reverse(int[] arr) {
    for (int i = 0, r = arr.length - 1; i < r; i++, r--) {
      int temp = arr[i];
      arr[i] = arr[r];
      arr[r] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {

    // 1.Sort in decending order
    int arr[] = { 3, 7, 2, 9, 4 };
    Arrays.sort(arr);
    reverse(arr);





    // 2. Find the first and last Occuurrence of a number
    int a[] = { 4, 2, 7, 4, 9, 4 };
    int first = -1, last = -1;
    int num = 4;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == num) {
        if (first == -1)
          first = i;
        last = i;
      }
    }
    System.out.println("First Occurrence of " + num + " is at index: " + first);
    System.out.println("Last Occurrence of " + num + " is at index: " + last);




    // 3. Count the frequency of each element
    int fr[] = { 1, 2, 2, 3, 3, 3 };
    int count = 1;
    for (int i = 1; i <= fr.length; i++) {
      if (i < fr.length && fr[i] == fr[i - 1]) {
        count++;
      } else {
        System.out.println(fr[i - 1] + " :occurs :" + count + "times");
        count = 1;
      }
    }




    // 4.Reverse the array in-place
    int arr2[] = { 10, 20, 30, 40, 50 };
    reverse(arr2);





    // 5. Check if array is sorted write a method that returns true if an array is
    // sorted in asecnding order other wise false

    int arr3[] = { 1, 2, 3, 4, 5, 5 };
    System.out.println(isSorted(arr3));




    // 6. Copy only even number
    int arr4[] = { 1, 4, 6, 7, 8 };
    int even[] = new int[arr4.length];
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] % 2 == 0) {
        even[i] = arr4[i];
      }
    }
    System.out.println(Arrays.toString(even));





    // 7. Find the Second Largest Number
    int arr5[] = { 10, 20, 4, 45, 99 };
    Arrays.sort(arr5);
    System.out.println("Second Largest Number is: " + arr5[arr5.length - 2]);




    // 8. Find Duplicate Elements
    int arr6[] = { 1, 3, 2, 3, 4, 1 };
    Arrays.sort(arr6);
    System.out.println("Duplicate Elements are: ");
    for (int i = 1; i < arr6.length; i++) {
      if (arr6[i] == arr6[i - 1]) {
        System.out.println(arr6[i]);
      }
    }




    // 9. Merge two sorted arrays
    int arr7[] = { 1, 3, 5 };
    int arr8[] = { 2, 4, 6 };
    int merged[] = new int[arr7.length + arr8.length];
    System.arraycopy(arr7, 0, merged, 0, arr7.length);
    System.arraycopy(arr8, 0, merged, arr7.length, arr8.length);
    Arrays.sort(merged);
    System.out.println("Merged Array: " + Arrays.toString(merged));



    
    // 10 .Binary Search without using Built-in method implement your own version of
    // binary search to find a number in a sorted array
    int arr9[] = { 4, 10, 15, 20, 25 };
    int n = 15;
    int low = 0;
    int high = arr9.length - 1;
    boolean found = false;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr9[mid] == n) {
        found = true;
        break;
      } else if (arr9[mid] < n) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    if (found) {
      System.out.println("Element " + n + " found in the array.");
    } else {
      System.out.println("Element " + n + " not found in the array.");
    }

  }

}