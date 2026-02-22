class Solution {
    public int pivotIndex(int[] nums)
    {
        int tot = 0;
        for(int n:nums)
        {
            tot+=n;
        }
        int ls = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(ls==tot-ls-nums[i])
            {
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}