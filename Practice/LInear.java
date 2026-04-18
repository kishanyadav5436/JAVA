public class LInear {
  public static int indexof(int arr[], int target){
    int p=arr.length/2;
     if(target==arr[p]){
      return p-1;
    
}else if(arr[p]<target){
    for(int i=p; i<=arr.length-1; i++){
      if(arr[i]==target){
        return  i;
      }
    }}else if(arr[p]>target){
      for(int i=0; i<=p-1; i++){
      if(arr[i]==target){
        return  i;
      }
    }
    }
    return -1;

  }
  public static void main(String[] args) {

     int arr[]={3,4,5,7,0,1,2};
     int target=0;
     System.out.println(indexof(arr, target));
    
  }
}
