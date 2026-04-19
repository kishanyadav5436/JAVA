public class SingleNUMBE {
  public static int SN(int arr[]){
    int result=0;
    for(int num:arr){
      result ^=num;
    }
    return result;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,1,2,3,4};
    System.err.println(SN(arr));
  }
  
}
