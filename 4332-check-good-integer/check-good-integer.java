class Solution {
    public boolean checkGoodInteger(int n)
    {
        int ds = 0;
        int ss = 0;
        while(n!=0)
        {
            int v = n%10;
            if(v==8 || v==9)
            {
                return true;
            }
            ds+=v;
            ss+=v*v;
            n=n/10;
        }
        return ss-ds >= 50;
    }
}