class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x)
    {
        int sum = 0;
        int v = x;
        while(v!=0)
        {
            sum+=v%10;
            v/=10;
        }
        if(x%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}