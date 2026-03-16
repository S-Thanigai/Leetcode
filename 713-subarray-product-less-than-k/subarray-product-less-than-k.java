class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k)
    {
        if(k==0)
        {
            return 0;
        }
        int c = 0;
        int p = 1;
        for(int i=0,j=0;j<nums.length;j++)
        {
            p*=nums[j];
            while(i<=j && p>=k)
            {
                p/=nums[i++];
            }
            c+=j-i+1;
        }
        return c;
    }
}