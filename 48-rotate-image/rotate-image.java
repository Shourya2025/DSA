class Solution {

    public void swap(int[][] matrix, int i, int j, int x, int y) {
         if (i == x && j == y) return; 
        matrix[i][j] = matrix[i][j] ^ matrix[x][y];
        matrix[x][y] = matrix[i][j] ^ matrix[x][y];
        matrix[i][j] = matrix[i][j] ^ matrix[x][y];
    }

    public void rotate(int[][] matrix) {

        // Step 1: Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        // Step 2: Reverse each row
        for (int m = 0; m < matrix.length; m++) {
            int i = 0;
            int j = matrix[0].length - 1;

            while (i < j) {
                swap(matrix, m, i, m, j);
                i++;
                j--;
            }
        }
    }
}