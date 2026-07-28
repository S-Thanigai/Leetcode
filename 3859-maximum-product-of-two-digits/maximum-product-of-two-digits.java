class Solution {
    public int maxProduct(int n)
    {
        int m1 = -1;
        int m2 = -1;
        while(n!=0)
        {
            int v = n%10;
            if(m1<=v)
            {
                m2 = m1;
                m1 = v;
            }
            else if(m2<v)
            {
                m2 = v;
            }
            n/=10;
        }
        return m1*m2;
    }
}