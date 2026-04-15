class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int idx = 0;
        int n = words.length ;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < words.length ;i++){
            if(words[i].equals(target)){
               int right = (i - startIndex + n) % n;
                int left = (startIndex - i + n) % n;
                ans = Math.min(ans, Math.min(left, right));
            }
        }
       if(ans ==  Integer.MAX_VALUE){
        return -1;
       }else {
        return ans;
       }
    }
}