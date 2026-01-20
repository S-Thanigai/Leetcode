class Solution {
    public int arrangeCoins(int n)
    {
        long c = 0;
        for(long i=1;i<=n;i++)
        {
            c+=i;
            if(c>n)
            {
                return (int)i-1;
            }
            if(c==n)
            {
                return (int)i;
            }
        }
        return 0;
    }
}