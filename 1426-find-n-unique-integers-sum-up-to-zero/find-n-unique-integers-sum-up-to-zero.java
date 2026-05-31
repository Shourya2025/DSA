class Solution {
    public int[] sumZero(int n) {
        int[] ans= new int[n];
        int i = 0; int j = n-1;
        int num = 1 ;
        while(i < j){
            ans[i] = num;
            ans[j] = -num;
            num++;
            i++;
            j--;        }
        return ans;
    }
}