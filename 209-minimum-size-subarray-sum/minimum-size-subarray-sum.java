class Solution {
    public int minSubArrayLen(int target, int[] nums)
    {
        int len = nums.length;
        int l = 0;
        int ml = Integer.MAX_VALUE;
        int sum = 0;
        for(int r = 0; r < len; r++)
        {
            sum += nums[r];
            while(sum >= target)
            {
                ml = Math.min(ml, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return ml == Integer.MAX_VALUE ? 0 : ml;
    }
}