class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> sm = new HashSet<>();
       for(int i = 0 ; i< allowed.length() ;i++){
        if(!sm.contains(allowed.charAt(i))){
            sm.add(allowed.charAt(i));
        }
       }

       int cnt = 0;
       for(int j = 0 ; j < words.length ;j++){
         boolean isValid = true;

        for(int m = 0 ; m < words[j].length() ;m++){
            char ch = words[j].charAt(m);
            if (!sm.contains(ch)) {
                    isValid = false;
                    break;
                }
        
        }
        if (isValid) {
                cnt++;
            }
       }
       return cnt; 
    }
}