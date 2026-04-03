public class Recursion{
  public static void printDEC(int n){
    if(n==1){
    System.out.println(n);
    return;
  }

    System.out.println(n+" ");
      printDEC(n-1);
  }
  public static void Increase(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
  Increase(n-1);
  System.out.println(n+" ");
  }

  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    int fact =n*factorial(n-1);
    return fact ;
  }
  public static  int SumofNatural(int n){
    if(n==1){
      return 1;
    }
    int sum =n+SumofNatural(n-1);
    return sum;
    

  }
  public static boolean isSorted(int arr[], int i){
    if(i==arr.length-1){
      return true;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    // if(arr[i]<arr[i+1])
    return isSorted(arr, i+1);
  }
  public static int FirstOccurance(int arr[], int key, int i){
    if(i==arr.length){
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return FirstOccurance(arr, key, i+1);
  }
    public static int lastOccurance(int arr[], int key, int i){
      if(i==arr.length){
        return -1;
      }
      int restArray=lastOccurance(arr, key, i+1);
      if(restArray!=-1){
        return restArray;
      }
      if(arr[i]==key){
        return i;
      }
      return -1;
    
    }

  public static void main(String[] args) {

    int n=5;
    int key=5;
    int i=0;
    int arr[]={1,2,3,4,5,6,8,9,9};
    //printDEC(n);
    //Increase(n);
    //System.out.println(SumofNatural(n));
    //System.out.println(factorial(n));
    //System.out.println(isSorted(arr, i));
    //System.out.println(FirstOccurance(arr, key, i));
    System.out.println(lastOccurance(arr, key, i));
    
  }
}