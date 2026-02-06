class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1 , len2);
        String longer = "";
        if(len1 == min ){
            longer = word2;
        }
        else  if(len2 == min ){
            longer = word1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < min ; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(longer.substring(min));
        return sb.toString();
    }
}