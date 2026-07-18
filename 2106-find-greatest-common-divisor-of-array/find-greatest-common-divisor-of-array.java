class Solution {
    public int findGCD(int[] nums)
    {
        int mi = Integer.MAX_VALUE;
        int ma = Integer.MIN_VALUE;
        for(int a:nums)
        {
            if(a>ma)
            {
                ma = a;
            }
            if(a<mi)
            {
                mi = a;
            }
        }
        return findGCDRecursive(mi,ma);
    }    
    public static int findGCDRecursive(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return findGCDRecursive(b, a % b);
    }
}