
public class nQueens {
      
    // printing function
    public static void print(char board[][]){
      System.out.println("-------Chess Board------");
       for(int i=0; i<board.length; i++){
          for(int j=0; j<board.length; j++){
             System.out.print(board[i][j]+" ");
          }
          System.out.println();
       }
    }

    // checking safty 
    public static boolean isSafe(char board[][], int row, int col){

        // vertical
        for(int i=row-1; i>=0; i--){
           if(board[i][col]=='Q'){
             return false;
           }
        }

        //left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
           if(board[i][j]=='Q'){
             return false;
           }
        }
        //right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
           if(board[i][j]=='Q'){
             return false;
           }
        }

        return true;
    }

    // placing of queens backtracking
    public static void nQueens(char board[][], int row){
        // base case
        if(row==board.length){
          count++;
          print(board);
          return;
        }
        // Kaam
        for(int j=0; j<board.length; j++){
          if(isSafe(board,row,j)){
             board[row][j] = 'Q';
             nQueens(board,row+1); // function call
             board[row][j] = 'x';  // backTrack
          }
        }
    }
          
     static int count = 0;     

    public static void main(String[] args) {
        int n = 5;

        char board[][] = new char[n][n];
        // initialization
        for(int i= 0 ; i<n; i++){
          for(int j=0; j<n; j++){
              board[i][j]='x';
          }
        }

        nQueens(board,0);
        System.out.print("No of solutions are : "+count);
    }
}