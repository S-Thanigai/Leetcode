class Solution
{
    final int mod = 10_00_00_00_07;
    public int xorAfterQueries(int[] nums, int[][] queries)
    {
        for(int a[]:queries)
        {
            int l = a[0];
            int r = a[1];
            int k = a[2];
            int v = a[3];
            int idx = l;
            while(idx<=r)
            {
                long temp = nums[idx];
                nums[idx] = (int)((temp * v) % mod);
                idx+=k;
            }
        }
        int ans = 0;
        for(int n:nums)
        {
            ans^=n;
        }
        return ans;
    }
}