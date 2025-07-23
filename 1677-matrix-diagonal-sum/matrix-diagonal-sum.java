class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
        int n = mat.length ;
        for(int i  =0 ; i < mat.length ; i++){
            for(int k = 0 ; k < mat[i].length ; k++)
            if(i == k || i+k == n-1){
                sum = sum +mat[i][k];
            }
        }
        return sum;
    }
}