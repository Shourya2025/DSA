class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        int k = 0;
        for(int i = 0 ; i < matrix[0].length ; i++){
            int sum = 0 ;
            for(int j = 0 ; j < matrix[i].length ;j++){
                sum += matrix[i][j];
            }
            ans[k++] = sum;

        }
        return ans;
    }
}