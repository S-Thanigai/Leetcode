class Solution {
    public int jump(int[] nums)
    {
        int mj=0;
        int ce=0;
        int mr=0;
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            mr = Math.max(mr,i+nums[i]);
            if(i==ce)
            {
                mj++;
                ce=mr;
            }
        }    
        return mj;
    }
}