class Solution {
    public int countBinarySubstrings(String s)
    {
        int cs = 1;
        int ps = 0;
        int n = s.length();
        int len = 0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cs+=1;
            }
            else
            {
                len += Math.min(ps, cs);
                ps = cs;
                cs = 1;
            }
        }
        len+=Math.min(ps,cs);
        return len;
    }
}