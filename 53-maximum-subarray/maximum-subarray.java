class Solution {
    public int maxSubArray(int[] nums)
    {
        long max = Long.MIN_VALUE;
        long su = 0;
        for(int n:nums)
        {
            su = Math.max(n,su+n);
            max = Math.max(max,su);
        }
        return (int)max;
    }
}