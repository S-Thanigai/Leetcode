class Solution {
    public int maxProfit(int[] nums)
    {
        int min=Integer.MAX_VALUE;
        int mp =0;
        for(int n:nums)
        {
            if(n<min)
            {
                min=n;
            }
            else
            {
                mp=Math.max(mp,n-min);
            }
        }
        return mp;
    }
}