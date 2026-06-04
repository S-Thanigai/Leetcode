class Solution {
    public int dominantIndex(int[] nums)
    {
        int n = nums.length;
        int ind = -1;
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>lar)
            {
                lar = nums[i];
                ind = i;
            }
        }
        boolean flag = true;
        for(int i=0;i<n;i++)
        {
            if(nums[i]*2 > lar && nums[i]!=lar)
            {
                flag = false;
            }
        }
        if(flag)
        {
            return ind;
        }
        else
        {
            return -1;
        }
    }
}