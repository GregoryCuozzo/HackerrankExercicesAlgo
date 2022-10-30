

public class DiagonalsSumMatrix {

    public static void main (String[] args){

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.print(diagonalsSum(matrix)) ;


    }

    public static int diagonalsSum(int [][] matrix){

        int sum = oppositeDiagonalMatrixSum(matrix) + diagonalMatrixSum(matrix);
        return sum;
    }

    public static int oppositeDiagonalMatrixSum(int[][] matrix){

        int sum = 0 ;

        for(int i=0 ; i<matrix.length; i++){
            for (int j=0 ; j<matrix[i].length ; j++){
                if(i==j){
                    int elem = matrix[i][matrix.length -i - 1];
                    sum +=elem;
                }

            }
        }return sum;
    }

    public static int diagonalMatrixSum(int[][] matrix){
        int sum = 0;
        for (int i =0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    int element = matrix[i][j];
                    sum +=element;
                }

            }
        }  return sum;

    }

    public static void oppositDiagonalMatric(int[][] matrix){

        for (int i =0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    int element = matrix[i][matrix.length - i - 1];
                    System.out.print(element);
                }
            }
        }


    }

    public static void diagonalMatrix (int[][] matrix){

        for (int i =0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    int element = matrix[i][j];
                    System.out.print(element);
                }
            }
        }

    }

    public static void readMatrix(int[][] matrix){

        for (int i =0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                int element = matrix[i][j];
                System.out.print( element);
            }
        }

    }

    public static void readElement(int[][] matrix){

        for (int i =0; i< matrix.length; i++){

            System.out.print("\nrow" + i + ":\n");
            for(int j = 0; j< matrix[i].length; j++){

                System.out.print("col " + j + " ");
            }
        }
    }
}
