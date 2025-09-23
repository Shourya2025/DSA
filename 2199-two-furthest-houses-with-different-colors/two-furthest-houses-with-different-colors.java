class Solution {
    public int maxDistance(int[] colors) {
        int max = -1 ;
        for(int i = 0 ; i < colors.length ; i++ ){
            int curr = 0 ;
            for(int j = i ; j < colors.length ; j++){
                if(colors[i] != colors[j]){
                    curr = Math.abs(i-j);
                    max = Math.max(curr , max);
                }
            }
        }
        return max ;
    }
}