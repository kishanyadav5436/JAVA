
class DigonalSum {
  public static int AdigonalSum(int arr[][]) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[0].length; j++) {
    //     if (i == j) {
    //       sum += arr[i][j];
    //     } else if (i + j == arr.length - 1) {
    //       sum += arr[i][j];
    //     }
    //   }
      
    // }
    // return sum;
    int sum=0;
    for(int i=0; i<arr.length; i++){
       sum+=arr[i][i];
      if(i!=arr.length-1-i){
        sum+=arr[i][arr.length-1-i];
    }    
  }
  return sum;

  }
public static boolean SerchEle(int arr[][], int key){
  int row=0; int col=arr[0].length-1;

 while (row<arr.length && col>=0  ) {
    if( arr[row][col]==key){
      System.out.println("found key at ("+row+","+col+")");
      return true;
  }
  else if(key<arr[row][col]){
    col--;
  }
  else{
    row++;
  }

}
System.out.println("Element not found:");
return false;

}
  public static void main(String[] args) {
int key=12;
    int arr[][] =
     { { 1, 2, 3, 4 }, 
     { 5, 6, 7, 8 }, 
     { 9, 10, 11, 12 }, 
     { 13, 14, 15, 16 } };
   // System.out.println(AdigonalSum(arr));
    System.out.println( SerchEle(arr,key)
);

  }
}
