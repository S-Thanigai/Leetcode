class Solution {
    public int[] constructTransformedArray(int[] nums)
    {
        int n = nums.length;
        int res[] = new int[n];
        int j = 0;
        for(int i=0;i<n;i++)
        {
            int ni = (i+nums[i])%n;
            if(ni<0)
            {
                ni+=n;
            }
            res[j++] = nums[ni];
        }
        return res;
    }
}