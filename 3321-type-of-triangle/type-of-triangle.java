class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        String str1 = "equilateral";
        String str2 = "isosceles";String str3 = "scalene";
         if (nums[0] + nums[1] <= nums[2]) {
            return "none";  
        }
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            return str1;
        }
        else if(nums[0] == nums[1] || nums[1] == nums[2]){
            return str2 ;
        }
        else {
            return str3;
        }
        
    }
}