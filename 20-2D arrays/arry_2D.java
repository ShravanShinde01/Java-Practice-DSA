import java.util.*;

public class arry_2D {

    public static void spiralMatrix(int matrix[][]){
      int Rowstart = 0;
      int RowEnd  = matrix.length-1;
      int colStart =0;
      int colEnd = matrix[0].length-1;

        while(Rowstart <= RowEnd && colStart<=colEnd){

          // TOP
           for(int j =colStart; j<=colEnd; j++){
              System.out.print(matrix[Rowstart][j]+" ");
           }

           //right
           for(int i = Rowstart + 1; i<=RowEnd; i++){
              System.out.print(matrix[i][colEnd]+" ");
           }
           
           //Bottom
        
                for (int j = colEnd - 1; j >= colStart; j--) {
                  if(Rowstart==RowEnd){
                    break;
                  }
                    System.out.print(matrix[RowEnd][j] + " ");
                }
            


           //left
           for(int i = RowEnd-1; i>=Rowstart+1; i--){
            if(colStart==colEnd){
              break;
            }
             System.out.print(matrix[i][colStart]+" ");
           }
          

           Rowstart++;
           RowEnd--;
           colStart++;
           colEnd--;

        }
        System.out.println();
    }

    public static void diagionalSum(int matrix2[][]){
      int sum = 0;
      for(int i = 0; i<matrix2.length; i++){
        for(int j=0; j<matrix2[0].length; j++){
           if(i==j){
            sum += matrix2[i][j]; 
           }
           if((i+j)==(matrix2.length-1) && i!=j){
             sum += matrix2[i][j];
           }
        }
      }
      System.out.print(sum);
    }
   
    public static void optDiagSum(int matrix2[][]){
      int sum = 0;
      int n = matrix2.length;

      for(int i = 0; i<n; i++){
        //pd
        sum += matrix2[i][i];
        //sd
        if(i != n-i-1){
          sum += matrix2[i][n-i-1];
        }
      }
      System.out.print(sum);
    }

   public static void searchInSortedMatrix(int sort[][],int key){
    int n = sort.length;
    int m = sort[0].length;

    int i = 0;
    int j = m-1;

    while(i<n && j>=0){
       if(key == sort[i][j]){
          System.out.print("key found at index : ("+i+","+j+")");
          return;
       }
       else if(key > sort[i][j] ){
             i++;
       }
       else{
          j--;
       }
    }
      System.out.print("Key not exist in matrix");
   }

    public static void main(String[] args) {
      int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

      int matrix2[][] = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};    

      int sort[][]  = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};                                

      //  spiralMatrix(matrix);
      // diagionalSum(matrix2);
    //   optDiagSum(matrix2);
    //   searchInSortedMatrix(sort,33);

    }
}