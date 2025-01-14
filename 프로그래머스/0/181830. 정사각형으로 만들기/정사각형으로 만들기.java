import java.lang.Math;

class Solution {
    public int[][] solution(int[][] arr) {
        return squareArray(arr);
    }
    
    private static int[][] squareArray(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int size = Math.max(row, column);
        
        int[][] result = new int[size][size]; // 자동으로 0으로 채워짐
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = arr[i][j];
            }
        }
        
        return result;
    }
}