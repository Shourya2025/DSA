class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] ans = new boolean[(grid.length * grid.length) ];
        int[] val = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (ans[grid[i][j] - 1] == false) {
                    ans[grid[i][j] - 1] = true;
                } else if ((ans[grid[i][j] - 1] != false)) {
                    val[0] = grid[i][j];
                }
            }
        }

        for(int k = 0 ; k < ans.length ; k++){
            if(ans[k] == false ){
                val[1] = k+1;
            }
        }
        return val;

    }
}