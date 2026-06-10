class Solution {
    public int[] leftRightDifference(int[] nums)
    {
        int rsum = 0;
        for(int n:nums)
        {
            rsum+=n;
        }
        int lsum = 0;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            rsum-=nums[i];
            res[i] = Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return res;
    }
}