class Solution {
    public boolean containsDuplicate(int[] nums) {
      /*  for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false ;
*/


        HashSet<Integer> sb = new HashSet<>();
        for(int num : nums){
            if(sb.contains(num)){
                return true ;
            }
            sb.add(num);
        }
        return false;







    }
}