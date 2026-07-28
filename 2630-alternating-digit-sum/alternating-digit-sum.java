class Solution {
    public int alternateDigitSum(int n)
    {
        boolean sign = true;
        int sum1 = 0;
        int sum2 = 0;
        while(n!=0)
        {
            int v = n%10;
            if(!sign)
            {
                sum1+=v;
                sign = true;
            }
            else
            {
                sum2-=v;
                sign=false;
            }
            n/=10;
        }
        if(sign)
        {
            return sum1+sum2;
        }
        return -(sum1+sum2);
    }
}