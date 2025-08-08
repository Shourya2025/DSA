class Solution {
    public int[] sortArray(int[] nums) {
        // Merge sort 
        int[] ans = mergeSort(nums);
        return ans ;
    }
    int[] mergeSort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums ,  0 ,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums ,  mid ,nums.length));
        return merge(left , right);


    }
    int[] merge(int[] first , int[] second){
        int i = 0 , j = 0 , k =0 ;
        int[] mix =  new int[first.length + second.length];
        while(i< first.length && j < second.length){
            if(first[i]<=second[j]){
                mix[k++]= first[i++];
            }
            else if(first[i]>=second[j]){
                mix[k++]= second[j++];
            }

        }
        while(i < first.length){
            mix[k++]= first[i++];
        }
         while(j < second.length){
            mix[k++]= second[j++];
        }
        return mix;
    }
}