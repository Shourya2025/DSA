class Solution {
    public String removeTrailingZeros(String num) {
    String str = String.valueOf(num);
    int i = str.length() -1;
    while(i >= 0 && str.charAt(i) == '0'){
        if(str.charAt(i) == '0'){
            i--;
        }
      }
    return str.substring(0,i+1);
    }
}