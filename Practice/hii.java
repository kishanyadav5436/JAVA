
import java.util.Scanner;
public class hii {
  public static int linerSerch(int mark[],int key){
    for(int i=0; i<mark.length; i++){
      if(mark[i]==key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int mark[]={20,30,70,60,86,30,50};
    System.out.println("Enter the key to search :");
    int key=sc.nextInt();
    int index=linerSerch(mark,key);
    if(index==-1){
      System.out.println("Elements not found or exist");
    }else{
      System.out.println("Element found :" + index + ":And key is :"+ key);
    }
  }

}