class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0 ; i < friends.length; i++){
            if(!st.contains(friends[i])){
                st.add(friends[i]);
            }
        }
        int[] ans  = new int[friends.length];
        int k = 0;
        for(int x : order){
            if(st.contains(x)){
                ans[k++] =x;
                st.remove(x);
            }
        }
        return ans;
    } 
}