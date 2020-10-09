public class Solution {
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            /**
             * Here we swap the element diagonally like transpose of matrix
             * [
             * [1,2,3] -> [1,4,7]
             * [4,5 6] -> [2,5,8]
             * [7,8 9] -> [3,6,9]
             * ]
             */
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }
        }

        /**
             * Here we swap the half element horizontally or
             * we reverse the each row
             * [
             * [1,4,7] -> [7,4,1]
             * [2,5,8] -> [8,5,2] 
             * [3,6,9] -> [9,6,3]
             * ]
             * 
             * And Tada we have the answer 😊
             */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                swapH(matrix,i,j);
            }
        }
    }
    //code to traspose the elements 
    public static void swap(int[][] matrix,int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    //Code to revese the row
    public static void swapH(int[][] matrix,int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length-1-j];
        matrix[i][matrix.length-1-j] = temp;
    }
}