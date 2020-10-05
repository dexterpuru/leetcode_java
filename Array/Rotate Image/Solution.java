public class Solution {
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                swapH(matrix,i,j);
            }
        }
    }
    public static void swap(int[][] matrix,int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void swapH(int[][] matrix,int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length-1-j];
        matrix[i][matrix.length-1-j] = temp;
    }
}