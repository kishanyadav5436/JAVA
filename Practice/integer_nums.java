import java.util.HashSet;
public class integer_nums {
  public static boolean  twice(int arr[]){
    for(int i=0; i<=arr.length-1; i++){
      for(int j=i+1; j<=arr.length-1; j++){
        if(arr[i]==arr[j]){

          return  true;
        }
      }
    }
    return  false;
  }

  public static boolean  twiceof(int arr[]){
    HashSet<Integer> n=new HashSet<>();
    for(int nums: arr){
      if(n.contains(nums)){
        return true;
      }
      n.add(nums);

    } 
    return false; 
  }
  public static void main(String[] args) {
      
    int arr[]={1,2,3};
    System.out.print(twiceof(arr));
  }
}

