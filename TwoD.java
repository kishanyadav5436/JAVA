public class TwoD {
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
