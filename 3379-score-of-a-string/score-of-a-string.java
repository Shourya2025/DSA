class Solution {
    public int scoreOfString(String s) {
        int[] arr = new int[s.length()];
        int k = 0 ;
        for(int i = 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            arr[k++] = ch - 'A';
        }
        int sum = 0;
        for(int j = 0 ; j < arr.length -1 ;j++){
            sum = sum + Math.abs(arr[j+1]- arr[j]);
           
        }
        return sum ;
    }
}