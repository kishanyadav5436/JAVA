public class Backtracking {

  public static void Totoalsu(String str, String ans, int i){ 
    // base case
    if(i == str.length()){
      System.out.println(ans);
      return;
    }

    // yes
    Totoalsu(str, ans + str.charAt(i), i + 1);
    // no
    Totoalsu(str, ans, i + 1);
  }

  public static void Permutation(String str, String a){
    // base case
    if(str.length() == 0){
      System.out.println(a);
      return;
    }

    for(int i = 0; i < str.length(); i++){
      char curr = str.charAt(i);

      // remove current character
      String newStr = str.substring(0, i) + str.substring(i + 1);

      Permutation(newStr, a + curr);
    }
  }

  public static void main(String args[]) {
    String str = "abc";
    Permutation(str, "");
  }
}