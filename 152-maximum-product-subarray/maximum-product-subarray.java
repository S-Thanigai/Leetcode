class Solution {
    public int maxProduct(int[] nums)
    {
        int p = 1;
        int n = nums.length-1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            p*=nums[i];
            if(p>max)
            {
                max = p;
            }
            if(p==0)
            {
                p=1;
            }
        }
        p = 1;
        for(int i=n;i>=0;i--)
        {
            p*=nums[i];
            if(p>max)
            {
                max = p;
            }
            if(p==0)
            {
                p=1;
            }
        }
        return max;
    }
}