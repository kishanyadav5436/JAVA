public class MatrixMultiply {
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
