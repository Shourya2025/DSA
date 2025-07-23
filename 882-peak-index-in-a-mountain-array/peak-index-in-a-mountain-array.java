class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //Binary Search Question 
        //Appraoch is binary seach untill start and end are equal 
        int start = 0 ;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                //Decreasing part of the array 
                end = mid ;
            }
            else {
                start = mid +1;
                //arr[mid] < arr[mid+1]
            }
        }
        return start ;
    }
}