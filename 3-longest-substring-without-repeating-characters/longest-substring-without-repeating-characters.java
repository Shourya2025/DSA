class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            Set<Character> st = new HashSet<>();
            for(int j = i ;j < s.length() ; j++){
                char ch = s.charAt(j);
                if(st.contains(ch) == true)break;
                st.add(ch);
                maxLen = Math.max(maxLen , j-i+1);
            }
        }
        return maxLen;
    }
}