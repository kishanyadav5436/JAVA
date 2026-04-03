public class sudko {
  public static boolean isSafe(int sudkou[][],int row, int col, int digit){
    //row
    for(int i=0; i<=8; i++){
      if(sudkou[i][col]==digit){
        return false;
      }
    }
    //col
    for(int j=0; j<=8; j++){
      if(sudkou[row][j]==digit){
        return false;
    }}

    //grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;
    for(int i=sr; i<sr+3; i++)
    {
      for(int j=sc; j<sc+3; j++){
        if(sudkou[i][col] == digit){
          return false;
        }

      }
    }
    return true;
    
  }
  public static boolean sudokoSolver(int sudkou[][], int row, int col) {
//base
if(row==9){
  return true;
}
//recursion
    int nextrow = row, nextcol = col + 1;
    if (col + 1 == 9) {
      nextrow = row + 1;
      nextcol = 0;
    }
    if(sudkou[row][col]!=0){
      return sudokoSolver(sudkou, nextrow, nextcol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudkou, row, col, digit)) {
        sudkou[row][col] = digit;
        if (sudokoSolver(sudkou, nextrow, nextcol)) {
          return true;
        }
        sudkou[row][col] = 0;

      }
    }
    return false;
  }
  public static void printSudoku(int sudkou[][]){
    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        System.out.print(sudkou[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int sudoku[][] = {
        { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
        { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
        { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
        { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
        { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
        { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
        { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
        { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
        { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
    };
    if(sudokoSolver(sudoku, 0, 0)){
      System.out.println("Solution exists");
      printSudoku(sudoku
      );
    }else{
      System.out.println("solution not exist");
    }

  }

}
