class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                k=i;
                found=true;
            }
        }
        if(found)
         return k;
        else
          return -1;
    }
}