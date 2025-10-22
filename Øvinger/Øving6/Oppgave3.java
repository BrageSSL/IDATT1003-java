import java.util.Arrays;
final class math{
    private final int[][] matrix;
    private final int rows;
    private final int cols;
    public math (int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            this.matrix[i] = Arrays.copyOf(matrix[i], cols);
        }
    }
    public int[][] getMatrix() {
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(this.matrix[i], cols);
        }
        return copy;
    }
    public static void addition(int [][]A, int [][] B){
        int rows = A.length;
        int cols = A[0].length;
        if (A.length != B.length || A[0].length != B[0].length){
            throw new IllegalArgumentException("The matrixes are not of the same dimention");
        }
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println(Arrays.deepToString(C));
    }
    public static void multiplication(int [][]A, int [][] B){
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        if (colsA != rowsB){
            throw new IllegalArgumentException("The matrixes dimentions are incompatible");
        }
        int[][] C = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++){
                for (int k = 0; k < colsB; k++) {
                    C[i][j] = A[i][k] * B[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(C));
    }
    public static void transpose(int [][] A){
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[j][i] = A[i][j];
            }
        }
        System.out.println(Arrays.deepToString(C));

    }
}
public class Oppgave3 {
    
    public static void main(String[] args) {
        math A = new math (new int [][] {{1,2,3,4},{1,2,3,4},{1,2,3,4}});
        math B = new math (new int [][] {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}});
        math C = new math (new int [][] {{4,3,2,1},{4,3,2,1},{4,3,2,1}});
        math D = new math (new int [][] {{4,3,2,1},{4,3,2,1},{4,3,2,1},{4,3,2,1}});

        math.addition(A.getMatrix(), C.getMatrix());
        math.multiplication(A.getMatrix(), B.getMatrix());
        math.transpose(D.getMatrix());
    }
}