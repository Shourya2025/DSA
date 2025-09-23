class Solution {
    public int differenceOfSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.clear();
        for(int i = 0 ; i < nums.length ; i++){
            digits(arr , nums[i]);
        }
        int sumarr =  0 ;
        for(int j = 0 ; j < nums.length ; j++){
            sumarr += nums[j];
        }
        int arrsum = 0 ;
        for(int z = 0 ; z < arr.size() ; z++){
            arrsum = arrsum+ arr.get(z);
        }
        return Math.abs(sumarr - arrsum);


    }
    void digits(ArrayList<Integer> arr , int no){
        if(no ==0){
            return ;
        }
        digits(arr , no/10);
        arr.add(no%10);
    }

}