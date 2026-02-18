class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int p = 1;
        int l = nums.length;
        int ans[] = new int[l];
        for(int i=0;i<l;i++)
        {
            if(i==0)
            {
                p*=nums[i];
                ans[i] = 1;
            }
            else
            {
                ans[i] = p;
                p*=nums[i];
            }
        }
        p=1;
        for(int i=l-1;i>=0;i--)
        {
           if(i==l-1)
           {
                p*=nums[i];
           }
           else
           {
                ans[i] = p*ans[i];
                p*=nums[i];
           }
        }
        return ans;
    }
}