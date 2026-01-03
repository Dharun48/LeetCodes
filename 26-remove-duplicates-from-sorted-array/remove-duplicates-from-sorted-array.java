class Solution {
    public int removeDuplicates(int[] nums) {
        int ex=1;
        for (int i=1;i<nums.length;i++) 
        {
          
                if (nums[i]!=nums[i-1])
                 {
                   nums[ex]=nums[i];
                   ex++;
                }
            
    }
        return ex;
    }
}
