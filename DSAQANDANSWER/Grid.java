public class Grid{
  public static int printGridways(int i, int j, int m, int n){
    if(i==n-1&j==m-1){
      return 1;
    }else if(i==n||j==m){
      return 0;

    }
   int w1=printGridways(i+1, j, m, n);
   int w2=printGridways(i, j+1, m, n);
   return w1 + w2;
  }

  
  public static int factorial(int x){
    int fact=1;
    for(int i=1; i<=x; i++){
      fact*=i;
    }
    return fact;


  }
  public static void printGridwaysLiner(int m, int n){
  
    int ways= factorial(m-1+n-1)/(factorial(m-1)*factorial(n-1));
    System.out.println(ways);
  }
  public static void main(String[] args) {
    int m=3;
    int n=3;
    printGridwaysLiner(m, n);
//System.out.println( printGridways(0,0,m,n));  }
}}