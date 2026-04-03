public class InvertedHalfP {
  public static void PrintHP(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.err.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.err.print("*");
      }
      System.err.println();
    }

  }

  //hafwith numbers
  public static void PrintHNP(int n){

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i+1; j++){
        System.err.print(j+" ");
      }
      System.out.println();
    }
    System.err.println();

  }
  //FlOYD's Triangle
  public static void FlOYDTraingle(int n){
       int counter=1;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
     
        System.out.print(counter +" ");
        counter++;
      }
      System.out.println();
    }

  }
      //01  traingle    

      public static void ZO(int n){
        for(int i=0; i<=n; i++){
          for(int j=1; j<=i; j++){
            if((i+j)%2==0){
              System.out.print("1");
            }else {
              System.out.print("0");
            }
            }
            System.out.println();
          }
        }

  //Butterfly 
 public static void HollowButterfly(int n) {
    // Upper half
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) System.out.print("*");
            else System.out.print(" ");
        }
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }

    // Lower half
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) System.out.print("*");
            else System.out.print(" ");
        }
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }
}

//Solid Rhombus
public static void Rhombus(int n){
  for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=1; j<=n; j++){
      System.out.print("*");
    }
    System.out.println();
  }

}
//Hollow Rhombus
public static void HollowRhombus(int n){
  for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=1; j<=n; j++){
      if(i==1 || i==n || j==1 || j==n){
        System.out.print("*");
      }else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }

}

//Diamond
public static void Diamond(int n){
  for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=1; j<=2*i-1; j++){
      System.out.print("*");
    } 
    System.out.println();
  }
  for(int i=n; i>=1; i--){
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=1; j<=2*i-1; j++){
      System.out.print("*");
    } 
    System.out.println();
  } 



}
//PailindromicPattern Nums
public static void PPN(int n){
  for(int i=1; i<=n; i++){
    //spaces
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    //descending order
    for(int j=i; j>=1; j--){
      System.out.print(j);
    }
    //assending
    for(int j=2; j<=i; j++){
      System.out.print(j);
    }
    System.out.println();
  }

}
  public static void main(String[] args) {
//PrintHP(5);
//PrintHNP(5);
//FlOYDTraingle(5);
//ZO(5);
//Butterfly(5);
//Rhombus(5);
//HollowRhombus(5);
//Butterfly(5);7
 
  PPN(5);
  }
}