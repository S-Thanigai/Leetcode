class Solution {
    public boolean checkDivisibility(int n)
    {
        int res = n;
        int dum = n;
        int pro = 1;
        int sum = 0;
        while(n!=0)
        {
            int v = n%10;
            pro*=v;
            n/=10;
        }
        while(dum!=0)
        {
            int v = dum%10;
            sum+=v;
            dum/=10;
        }
        int su = pro+sum;
        return res%su==0;
    }
}