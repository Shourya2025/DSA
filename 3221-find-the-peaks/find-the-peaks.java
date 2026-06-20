class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();
        if(mountain.length <=2){
            return ans;
            
        }
        if(mountain.length == 3){
            if(mountain[1]> mountain[0] && mountain[1]> mountain[2]){
                ans.add(1);
                return ans;
            }else {
                return ans;
            }
        }
        for(int i = 1; i < mountain.length -1 ; i++){
            if(mountain[i]> mountain[i-1] && mountain[i]> mountain[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}