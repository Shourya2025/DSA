class Solution {
    public void reverseString(char[] s) {
        // int start = 0 ;
        // int end = s.length -1 ;
        // while(start<=end){
        //     swap(s , start , end);
        //     start ++;
        //     end--;

        // }
         helper(s , 0 , s.length -1);
        
    }
    // public void swap(char[] s , int start , int end){
    //     char temp = s[start];
    //     s[start] = s[end];
    //     s[end] = temp;
    // }
    public void helper(char[] s , int start , int end){
        if(start >=end){
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(s , start +1 , end-1);
    }
}