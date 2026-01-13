class Solution {
    public int maxDistinct(String s) {
        Set<Character> st = new HashSet<>();
        int cnt  = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!st.contains(ch)){
                cnt++;
            }
            st.add(ch);
        }
        return cnt;
    }
}