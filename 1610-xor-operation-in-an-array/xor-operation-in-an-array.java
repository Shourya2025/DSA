class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]= start + 2*i;
        }
        int no = arr[0];
        for(int j = 1;  j< n ; j++){
            no = no ^ arr[j];

        }
        return no ;
       
    }
}