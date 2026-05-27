import java.util.*;
class Solution {
    public int maxProduct(int n) {
        List<Integer> ans = new ArrayList<>();
        while(n != 0){
            int d = n%10 ;
            n = n/10;
            ans.add(d);
        }
        Collections.sort(ans);
        int size = ans.size()-1;
        return ans.get(size -1)*ans.get(size);
    }
}