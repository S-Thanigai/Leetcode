class Solution {
    public boolean canJump(int[] nums)
    {
        int mr = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>mr)
            {
                return false;
            }
            mr = Math.max(mr,i+nums[i]);
        }
        return true;
    }
}