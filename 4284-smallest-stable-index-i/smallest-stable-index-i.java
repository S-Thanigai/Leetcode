class Solution {
    public int firstStableIndex(int[] nums, int k)
    {
        int n = nums.length;
        int parr[] = new int[n];
        int sarr[] = new int[n];
        parr[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            parr[i] = Math.max(parr[i-1],nums[i]);
        }
        sarr[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sarr[i] = Math.min(sarr[i+1],nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(parr[i] <= k + sarr[i])
            {
                return i;
            }
        }
        return -1;
    }
}