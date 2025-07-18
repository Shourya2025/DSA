class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // ceiling of a number and equal to condition removed plus thelast point word wrap we do return s%n 
        
        int start = 0 ;
        int end = letters.length -1;
        while(start <= end ){
            int mid = (start  + end)/2;
            if( letters[mid] <= target ){
                start =  mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return letters[start%letters.length] ;
    }
}