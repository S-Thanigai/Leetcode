class Solution {
    public int longestOnes(int[] nums, int k)
    {
        int l = 0;
        int len = nums.length;
        int c = 0;
        int max = 0;
        for(int r=0;r<len;r++)
        {
            if(nums[r]==0)
            {
                c+=1;
            }
            while(c>k)
            {
                if(nums[l]==0)
                {
                    c-=1;
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}