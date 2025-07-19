class Solution { 
    // See yaha brute force fail hogi not saying ki galat hai par hash set yes set is a container of diffenet disctint elememts jab padhogi tab samjhana 
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