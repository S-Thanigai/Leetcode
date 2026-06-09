class Solution {
    public int balancedStringSplit(String s)
    {
        int res = 0;
        int c = 0;
        for(char ch:s.toCharArray())
        {
            if(ch=='R')
            {
                c+=1;
            }
            else
            {
                c-=1;
            }
            if(c==0)
            {
                res+=1;
            }
        }
        return res;
    }
}