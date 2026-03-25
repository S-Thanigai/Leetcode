class Solution {
    public int rob(int[] nums)
    {
        int f = 0;
        int s = 0;
        for(int n:nums)
        {
            int temp = Math.max(f,s+n);
            s=f;
            f=temp;
        }
        return f;
    }
}