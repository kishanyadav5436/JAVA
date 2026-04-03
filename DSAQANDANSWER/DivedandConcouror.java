class DivedandConcouror {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;

    mergeSort(arr, si, mid); // left half
    mergeSort(arr, mid + 1, ei); // right half

    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int merged[] = new int[ei - si + 1];

    int idx1 = si;
    int idx2 = mid + 1;
    int x = 0;

    while (idx1 <= mid && idx2 <= ei) {
      if (arr[idx1] <= arr[idx2]) {
        merged[x++] = arr[idx1++];
      } else {
        merged[x++] = arr[idx2++];
      }
    }

    while (idx1 <= mid) {
      merged[x++] = arr[idx1++];
    }

    while (idx2 <= ei) {
      merged[x++] = arr[idx2++];
    }

    // copy back
    for (int i = 0, j = si; i < merged.length; i++, j++) {
      arr[j] = merged[i];
    }
  }

  // Quick sort
  public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx - 1); // left
    quickSort(arr, pIdx + 1, ei); // right
  }
  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1; // to make space for
    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        // swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }
  public static void main(String[] args) {
    int arr[] = { 9, 5, 6, 8, 4, 3, 9, 2 };
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
    quickSort(arr, 0, arr.length - 1);
    printArray(arr);
  
  }
}