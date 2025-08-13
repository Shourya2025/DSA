class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.clear();
        int i = 0 ;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct);

            }
            else {
                i++;
            }
        }
        for(int s =0 ; s < nums.length ; s++){
            if(nums[s] != s+1){
                ls.add(s+1);
            }
        }
        return ls ;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}