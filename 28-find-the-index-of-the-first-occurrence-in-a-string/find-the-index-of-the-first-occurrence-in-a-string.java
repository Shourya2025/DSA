class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (needle.isEmpty()) {
            return 0;
        }
        for(int i = 0 ;i <= haystack.length() -len ; i++){
            char ch1 = needle.charAt(0);
            char ch = haystack.charAt(i);
            if(ch == ch1){
                boolean ans = haystack.substring(i , i+len).equals(needle);
                if(ans== true){
                    return i ;
                    
                }
            }
        }
        return -1;
    }
}