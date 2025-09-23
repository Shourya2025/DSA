class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for(int i = 0 ; i< arr.length ; i++){
            int cnt=0;
            int max = -1 ;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j]> max){

                   max = arr[j];
                    cnt++;
                   
                }
            }
            if(cnt==0){
                arr[i] = -1;
            }
            else {
                arr[i]= max;
            }

        }
        return arr;
    }
}


       