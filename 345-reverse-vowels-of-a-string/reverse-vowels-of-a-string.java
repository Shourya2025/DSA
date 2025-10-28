class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0 ;
        int end = s.length()-1;
        while(start<end){
            char chs = sb.charAt(start);
            char che = sb.charAt(end);
            if(chs == 'a' || chs == 'e' || chs == 'i' || chs == 'o' || chs == 'u' || chs == 'A' || chs == 'E' || chs == 'I' ||chs == 'O' || chs == 'U' ){
                if(che == 'a' || che == 'e' || che == 'i' || che == 'o' || che == 'u' || che == 'A' || che == 'E' || che == 'I' ||che == 'O' || che == 'U' ){
                    swap(sb , start , end);
                    start++;
                    end--;

                }else{
                    end--;
                }

            }else{
                start++;
            }


        }
        return sb.toString();
    }
     public void swap(StringBuilder sb , int start , int end){
       char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, temp);
    }
}