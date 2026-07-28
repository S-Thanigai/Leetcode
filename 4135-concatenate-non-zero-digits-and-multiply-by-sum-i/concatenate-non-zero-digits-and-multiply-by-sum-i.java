class Solution {
    public long sumAndMultiply(int n)
    {
        long d = 0;
        long sum = 0;
        while(n!=0)
        {
            long v = n%10;
            if(v!=0)
            {
                sum = sum * 10 + v;
                d+=v;
            }
            n/=10;
        }
        return reverse(sum)*d;
    }
    public long reverse(long n)
    {
        long rev = 0;
        while(n!=0)
        {
            rev = rev * 10 + n%10;
            n/=10;
        }
        return rev;
    }
}