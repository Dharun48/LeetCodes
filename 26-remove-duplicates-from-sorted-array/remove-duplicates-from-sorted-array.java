class Solution {
    public int removeDuplicates(int[] nums) {
        int ex=0;
        for (int i=0;i<nums.length;i++) 
        {
            boolean isDuplicate=false;
            for (int j=0;j<ex;j++)
             {
                if (nums[i]==nums[j])
                 {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate)
             {
                nums[ex]=nums[i];
                ex++;
            }
    }
        return ex;
    }
}
