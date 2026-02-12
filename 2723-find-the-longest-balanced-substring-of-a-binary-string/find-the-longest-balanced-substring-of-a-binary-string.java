class Solution {
    public int findTheLongestBalancedSubstring(String s)
    {
        int z = 0;
        int o = 0;
        int m = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                if(o>0)
                {
                    z=0;
                    o=0;
                }
                z++;
            }
            else
            {
                o++;
                m=Math.max(m,2*Math.min(z,o));
            }
        }
        return m;
    }
}