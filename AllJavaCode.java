// All Java code combined from multiple files
import java.util.*;

// Code from A.java
class A {
  static void reverse(int arr[]){
    for (int i = 0, r = arr.length - 1; i < r; i++, r--) {
      int temp = arr[i];
      arr[i] = arr[r];
      arr[r] = temp;
    }
  }
  public static void main(String[] args) {
    int arr[]={10,40,80,90,100,20};
    for(int num:arr){
      System.out.println(num+"");
    }
    System.out.println();
    reverse(arr);
    System.out.println("reversed array:");
    for (int num : arr) {
      System.out.println(num + "");
    }
  }
}

// Code from Ab.java
class Ab {
  public static void main(String[] args) {
    int i = 1;
    while (i < 5) {
      System.out.println(i + "");
      i += 2;
    }
  }
}

// Code from Array.java
class Array {
  //linear Search
/*static  int find(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }
  //reverse 
  static  void reverse(int[] arr) {
    for (int r = arr.length-1; r< arr.length; r--) {
      int temp = arr[r];
      
    }*/

  public static void main(String[] args) {
   //deleration and creation
   /*  int []a;//declaration
    a=new int[5];
    int b[]={1,2,3,4,5};
    String c[]=new String[5];
    //length & alteration
    int n=b.length;
    for(int i=0;i<n;i++){
      System.out.println(b[i]);
    }
    for(int val:b){
      System.out.println(val);
    }
    int arr []={5,2,9,1,5};
    Arrays.sort(arr); 
    System.out.println("Stored array:"+Arrays.toString(arr));
    int pos=Arrays.binarySearch(arr, 5);
    System.out.println("Position of 5 in the sorted array:"+pos);*/
   // Array Copy
   int src[]={1,2,3,4,5};
   int []first3=java.util.Arrays.copyOf(src, 3);
   int []mid=java.util.Arrays.copyOfRange(src, 1, 4);
   System.out.println("Orignal src array :"+java.util.Arrays.toString(src));
   System.out.println("First 3 elements:"+java.util.Arrays.toString(first3));
   System.out.println("Mid:"+java.util.Arrays.toString(mid));
  }
}

// Code from Assig.java
class Assig {
  static void greet() {
    System.out.println("Helllo! Welocme to Java");
  }
  static String getMessage() {
    return "Java is awesome !";
  }
  static void greet(String name) {
    System.out.println("Hellow," + name + "!");
  }
  static int add(int a, int b) {
    return a + b;
  }
  static double add(double a, double b) {
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println((add(5, 70)));
    System.out.println((add(6.7, 8.70)));
    // System.out.println(result);
    // greet("Alice");
    // greet("Bob");
    // String msg=getMessage();
    // System.out.println(msg);
    // greet();
    // greet();
    // int x=5,y=8;
    /*
     * System.out.println(x>y);
     * System.out.println(x<y);
     * System.out.println(x>=y);
     * System.out.println(x<=y);
     * System.out.println(x!=y);
     * System.out.println(x==y);
     * int age=25;
     * System.out.println(age>18 && age<30);
     * System.out.println(age>18 || age>30);
     * System.out.println(!(age==25));
     * int a=10;
     * System.out.println(a+=5);
     * System.out.println(a+=5);
     * System.out.println(a-=5);
     * System.out.println(a/=5);
     * System.out.println(a*=5);
     * System.out.println(a%=5);
     * System.out.println(a&=5);
     * System.out.println(a^=5);
     * System.out.println(a>>=5);
     * System.out.println(a<<=5);
     * int a=10;
     * System.out.println(++a);
     * System.out.println(a--);
     * System.out.println(a);
     */
    /*

    //  Example usage of switch statement

        int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
        syntax :
        //while (condition) {
        //   // code block
        //}
        //example
        //int i=1;
       // while (i <= 5) {
       //     System.out.println(i) ;
       //     i++;
       // }
        //do while loop
       //syntax :
       //do {
       //   // code block
       //} while (condition);
       //example
      // int i = 1;
       //do {
           System.out.println(i);
           i++;
       } while (i <= 5);
        //for loop
        //syntax :
        //for (initialization; condition; update) {
        //   // code block
        //}
        //example
      //  for (int j = 1; j <= 5; j++) {
          //  System.out.println(j);}
*/
    /* * int marks = 55;
     * if (marks >= 90) {
     * System.out.println("Grade: A");
     * } else if (marks >= 75) {
     * System.out.println("Grade: A");
     * } else if (marks >= 60) {
     * System.out.println("Grade: B");
     * } else {
     * System.out.println("Grade:C");
     * }
     */
    // Declare variables of different data types
    /*
     int age=16;
    if (age >= 18) {
      System.out.println("You are eligible to vote.");
    } else {
      System.out.println("You are not eligible to vote.");
    }
        int  num=1000;
    byte b=(byte)num;
    System.out.println(b);
     * int age = 10;
     * String name = "John Doe";
     * int[] marks = { 85, 90, 78 };
     * // Print the values
     * System.out.println("Integer Value: " + age);
     * 
     * System.out.println("Name: " + name);
     * System.out.println("First mark: " + marks[0]);
     */
    /*
     * int a=200;
     * double b=a;
     * byte c=(byte)a;
     * System.out.println( "Print the num :"+a);
     * System.out.println("Implict type :"+b);
     * System.out.println("Explicit type :"+c);
     * int var1 = 200;
     * int var2 = 300;
     * int var3 = 400;
     * System.out.println(" orignal values :" + var1 + " " + var2 + " " + var3);
     * double var4 = (double)((var1 + var2 + var3) / 3);
     * System.out.println("Average of given values: " + var4);
     * boolean var6 = var4 > (double)var1;
     * boolean var7 = var4 > (double)var2;
     * boolean var8 = var4 > (double)var3;
     * var1 *= 2;
     * var2 += 5;
     * var3 -= 3;
     * System.out.println(" UPDATED values" + var1 + " " + var2 + " " + var3);
     * var1 = var1++;
     * var2 = var2--;
     * var3 = var3++;
     * System.out.println("final outcome of the calculation: ");
     * System.out.println("Updated a: " + var1);
     * System.out.println("Updated b: " + var2);
     * System.out.println("Updated c: " + var3);
     * System.out.println("Is average greater than a? " + var6);
     * System.out.println("Is average greater than b? " + var7);
     * System.out.println("Is average greater than c? " + var8);
     */
  }
}

// Code from KishanKumar.java
class KishanKumar {
  static boolean isSorted(int arr[]) {
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] < arr[j - 1])
        return false;
    }
    return true;
  }
  static void reverse(int[] arr) {
    for (int i = 0, r = arr.length - 1; i < r; i++, r--) {
      int temp = arr[i];
      arr[i] = arr[r];
      arr[r] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    // 1.Sort in decending order
    int arr[] = { 3, 7, 2, 9, 4 };
    Arrays.sort(arr);
    reverse(arr);
    // 2. Find the first and last Occuurrence of a number
    int a[] = { 4, 2, 7, 4, 9, 4 };
    int first = -1, last = -1;
    int num = 4;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == num) {
        if (first == -1)
          first = i;
        last = i;
      }
    }
    System.out.println("First Occurrence of " + num + " is at index: " + first);
    System.out.println("Last Occurrence of " + num + " is at index: " + last);
    // 3. Count the frequency of each element
    int fr[] = { 1, 2, 2, 3, 3, 3 };
    int count = 1;
    for (int i = 1; i <= fr.length; i++) {
      if (i < fr.length && fr[i] == fr[i - 1]) {
        count++;
      } else {
        System.out.println(fr[i - 1] + " :occurs :" + count + "times");
        count = 1;
      }
    }
    // 4.Reverse the array in-place
    int arr2[] = { 10, 20, 30, 40, 50 };
    reverse(arr2);
    // 5. Check if array is sorted write a method that returns true if an array is
    // sorted in asecnding order other wise false
    int arr3[] = { 1, 2, 3, 4, 5, 5 };
    System.out.println(isSorted(arr3));
    // 6. Copy only even number
    int arr4[] = { 1, 4, 6, 7, 8 };
    int even[] = new int[arr4.length];
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] % 2 == 0) {
        even[i] = arr4[i];
      }
    }
    System.out.println(Arrays.toString(even));
    // 7. Find the Second Largest Number
    int arr5[] = { 10, 20, 4, 45, 99 };
    Arrays.sort(arr5);
    System.out.println("Second Largest Number is: " + arr5[arr5.length - 2]);
    // 8. Find Duplicate Elements
    int arr6[] = { 1, 3, 2, 3, 4, 1 };
    Arrays.sort(arr6);
    System.out.println("Duplicate Elements are: ");
    for (int i = 1; i < arr6.length; i++) {
      if (arr6[i] == arr6[i - 1]) {
        System.out.println(arr6[i]);
      }
    }
    // 9. Merge two sorted arrays
    int arr7[] = { 1, 3, 5 };
    int arr8[] = { 2, 4, 6 };
    int merged[] = new int[arr7.length + arr8.length];
    System.arraycopy(arr7, 0, merged, 0, arr7.length);
    System.arraycopy(arr8, 0, merged, arr7.length, arr8.length);
    Arrays.sort(merged);
    System.out.println("Merged Array: " + Arrays.toString(merged));
    // 10 .Binary Search without using Built-in method implement your own version of
    // binary search to find a number in a sorted array
    int arr9[] = { 4, 10, 15, 20, 25 };
    int n = 15;
    int low = 0;
    int high = arr9.length - 1;
    boolean found = false;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr9[mid] == n) {
        found = true;
        break;
      } else if (arr9[mid] < n) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    if (found) {
      System.out.println("Element " + n + " found in the array.");
    } else {
      System.out.println("Element " + n + " not found in the array.");
    }
  }
}

// Code from Loop.java
import java.util.Scanner;
class Loop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    /*
     * if (n > 0) {
     * System.out.println("Postive");
     * } else {
     * System.out.println("Negative");
     * }
     * for (int i = 1; i <= n; i++) {
     * System.out.println(i);
     * }
     * switch (n) {
     * case 1:
     * System.out.println("SUNDAY");
     * break;
     * case 2:
     * System.out.println("MONDAY");
     * break;
     * case 3:
     * System.out.println("TUESDAY");
     * break;
     * case 4:
     * System.out.println("WEDNESDAY");
     * break;
     * case 5:
     * System.out.println("THURSDAY");
     * break;
     * case 6:
     * System.out.println("FRIDAY");
     * break;
     * case 7:
     * System.out.println("SATURDAY");
     * break;
     * default:
     * 
     * System.out.println("Invalid day");
     */
    if (n <= 0) {
      System.out.println("Invalid input");
    } else {
      for (int i = 1; i <= n; i++) {
        System.out.println(i);
      }
      double sum = 0;
      int i = 1;
      while (i <= n) {
        if (i % 2 == 0) {
          sum += i;
        }
        i++;
      }
      System.out.println("Sum: " + sum);
      int k = 1;
      do {
        System.out.println(k + "*" + n + "=" + (k * n));
        k++;
      } while (k <= 10);
      int Choice = scanner.nextInt();
      switch (Choice) {
        case 1:
          boolean isPrime = true;
          for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
              isPrime = false;
              break;
            }
          }
          if (isPrime) {
            System.out.println("Prime");
          } else {
            System.out.println("Not Prime");
          }
          break;
        case 2:
          if (n % 2 == 0) {
            System.out.println("Even");
          } else {
            System.out.println("Odd");
          }
          break;
        default:
          System.out.println("Invalid case");
      }
      System.out.println("Exiting...");
    }
  }
}

// Code from MatrixAdd.java
class MatrixAdd {
  public static int[][] add(int[][] A, int[][] B) {
    int R = A.length;
    int C = A[0].length;
    int[][] S = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        S[i][j] = A[i][j] + B[i][j];
      }
    }
    return S;
  }
  public static void PrintMatrix(int[][] M) {
    for (int[] row : M) {
      for (int val : row) {
        System.out.print(val + "  ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] A = {
        { 1, 2, 3 }, { 4, 5, 6 }
    };
    int[][] B = {
        { 7, 8, 9 }, { 10, 11, 12 }
    };
    System.out.println("MatrixA:");
    PrintMatrix(A);
    System.out.println("Matrix B:");
    PrintMatrix(B);
    int sum[][] = add(A, B);
    System.out.println("\n Sum of A & B:");
    PrintMatrix(sum);
  }
}

// Code from MatrixMultiply.java
class MatrixMultiply {
  static int[][] multiply(int[][] A, int[][] B) {
    int r = A.length, k = A[0].length, c = B[0].length;
    int[][] C = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        for (int t = 0; t < k; t++) {
          C[i][j] += A[i][t] * B[t][j];
        }
      }
    }
    return C;
  }
  public static void PrintMatrix(int[][] M) {
    for (int[] row : M) {
      for (int val : row) {
        System.out.print(val + "  ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] A = {
        { 1, 2, 3 }, { 4, 5, 6 }
    };
    int[][] B = {
        { 7, 8 }, { 9, 10 }, { 11, 12 }
    };
    int[][] C = multiply(A, B);
    System.out.println("Matrix A:");
    PrintMatrix(A);
    System.out.println("Matrix B:");
    PrintMatrix(B);
    System.out.println("Result of A*B:");
    PrintMatrix(C);
  }
}

// Code from Q.java
import java.util.Scanner;
class Q {
  static void PrintTable(int n) {
    for (int j = 1; j <= 10; j++) {
      System.out.println(j + " * " + n + " = " + (j * n));
    }
   // int i = 1;
    //do {
    //  System.out.println(i + "*" + n + "=" + (i * n));
    //  i++;
   // } while (i <= 10);
  }
  public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=Sc.nextInt();
    PrintTable(n);
  }
}

// Code from Strinbluider.java
class Strinbluider {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append("World");
    System.out.println("After append:" + sb);
    sb.insert(5, "java");
    System.out.println("After insert:" + sb);
    sb.delete(1, 4);
    System.out.println("After delete:" + sb);
    sb.reverse();
    System.out.println("After reverse:" + sb);
  }
}

// Code from StringOperatio.java
class StringOperatio {
  public static void main(String[] args) {
    String str1 = "Java";
    System.out.println("Length of\"" + str1 + "\"\u2192" + str1.length());
    String str2 = "Hello";
    String str3 = "World";
    System.out.println("\"" + str2 + "\"+\"" + str3 + "\"\u2192" + (str2 + str3));
    System.out.println();
    System.out.println("Using Concat():" + str2.concat(str3));
    System.out.println();
    System.out.println("\"" + str1 + "\".charAt(2)\u2192" + str1.charAt(2));
    String str4 = "Programming";
    System.out.println("\"" + str4 + "\".substring(1,4)\u2192" + str4.substring(1, 4));
    String str5 = "java";
    System.out.println("\"" + str5 + "\").toUpperCase()\u2192" + str5.toUpperCase());
    String str6 = "HELLO";
    System.out.println("\"" + str6 + "\").toLowerCase()\u2192" + str5.toLowerCase());
    String str7 = "  Welcome to java   ";
    System.out.println("Before trim:\"" + str7 + "\"");
    System.out.println("After trim:\"" + str7.trim() + "\"");
    System.out.println("\"Java\".replace('a','o')\u2192" + "Java".replace('a', 'o'));
    System.out.println("\"java\".equals(\"\")\u2192" + "java".equals("java"));
    System.out.println("\"java\".equalsIgnoreCase(\"Java\")\u2192" + "java".equalsIgnoreCase("Java"));
  }
}

// Code from TwoD.java
class TwoD {
  public static void transposeSquare(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m[0].length; j++) {
        int t = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = t;
      }
    }
  }
  public static int[][] transpose(int[][] m) {
    int R = m.length;
    int C = m[0].length;
    int[][] t = new int[C][R];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        t[j][i] = m[i][j];
      }
    }
    return t;
  }
  public static void PrintMatrix(int[][] m) {
    for (int[] row : m) {
      for (int val : row) {
        System.out.print(val + "  ");
      }
      System.out.println();
    }
  }
  public static int rowSum(int[][] m, int r) {
    int sum = 0;
    for (int j = 0; j < m[r].length; j++) {
      sum += m[r][j];
    }
    return sum;
  }
  public static int colSum(int[][] m, int c) {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += m[i][c];
    }
    return sum;
  }
  public static void main(String[] args) {
    /*
     * rectangle
     * int[][]mat=new int[3][4];
     * int[][] grid={{1,2,3},{4,5,6}};
     * //jagged
     * int[][]jag=new int[3][];
     * jag[0]=new int[]{1,2};
     * jag[1]=new int[]{3,4,5};
     * jag[2]=new int []{6}; int[][] jag=new int[3][];
     * jag[0]=new int[]{1,2};
     * jag[1]=new int[]{3,4,5};
     * jag[2]=new int []{6};
     * System.out.println("jagged array Contents:");
     * for(int i=0;i<jag.length;i++){
     * for(int j=0; j<jag[i].length;j++){
     * System.out.print(jag[i][j]+" ");
     * }
     * System.out.println();
     * };
     * int grid[][]={
     * {1, 2, 3},
     * {4, 5, 6},
     * {7, 8, 9}
     * 
     * };
     * System.out.println("Printing 2D grid:");
     * for(int i=0;i<grid.length;i++){
     * for(int j=0; j<grid[i].length;j++){
     * System.out.print(grid[i][j]+" ");
     * }
     * System.out.println();
     * };
     * int[][]jag=new int[3][];
     * jag[0]=new int[]{1,2};
     * jag[1]=new int[]{3,4,5};
     * jag[2]=new int []{6};
     * System.out.println("jagged array elements:");
     * for(int i=0;i<jag.length;i++){
     * for(int j=0; j<jag[i].length;j++){
     * System.out.print(jag[i][j]+" ");
     * }
     * System.out.println();
     * };
     * int [][]grid={
     * {1,2,3},{4,5,6},{7,8,9}
     * };
     * System.out.println("2D Array elements:");
     * for(int i=0; i<grid.length;i++){
     * for(int j=0;j<grid[i].length;j++){
     * System.out.print(grid[i][j]+" ");
     * }
     * System.out.println();
     * };
     * 
     * 
     * int[][] matrix = {
     * { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
     * 
     * };
     * int rowIndex = 2;
     * int colIndex = 2;
     * System.out.println("Sum of row" + rowIndex + "=" + rowSum(matrix, rowIndex));
     * System.out.println("Sum of col" + colIndex + "=" + colSum(matrix, colIndex));
     * 
     * int[][] matrix = {
     * { 1, 2, 3 },
     * { 4, 5, 6 },
     * { 7, 8, 9 }
     * };
     * System.out.println("Orignal matrix:");
     * PirntMatrix(matrix);
     * transposeSequare(matrix);
     * System.out.println("\n Transpose Matrix:");
     * PirntMatrix(matrix);
     */
    int matrix[][] = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };
    System.out.println("Orignal Matrix:");
    PrintMatrix(matrix);
    int[][] transposed = transpose(matrix);
    System.out.println("\n Transpose Matrix:");
    PrintMatrix(transposed);
  }
}

// Code from Work.java
import java.util.Scanner;
class Work {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = Sc.nextInt();
    System.out.println("Print the Table:");
    for (int i = 1; i <= 10; i++) {
      System.out.println(a + "x" + i + "=" + (a * i));
    }
    System.out.println("Enter a number :");
    int b=Sc.nextInt();
    int r=0;
    while (b!=0) {
      int d=b%10;
      r=r*10+d;
      b=b/10;
    }
    System.out.println("Reversed num:"+r);
    System.out.println("Check the number is Palidrome or not");
    int c=Sc.nextInt();
  }
}
