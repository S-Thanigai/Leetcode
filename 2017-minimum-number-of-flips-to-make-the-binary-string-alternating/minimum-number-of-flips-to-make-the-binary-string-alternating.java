class Solution {
    public int minFlips(String s)
    {
        int n = s.length();
        int c0 = 0;
        int c1 = 0;
        String s1 = s+s;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s1.length();i++)
        {
            char e0 = (i%2==0) ? '0' : '1';
            char e1 = (i%2==0) ? '1' : '0';
            if(s1.charAt(i)!=e0)
            {
                c0++;
            }
            if(s1.charAt(i)!=e1)
            {
                c1++;
            }
            if(i>=n)
            {
                char p0 = ((i-n)%2==0) ? '0' : '1';
                char p1 = ((i-n)%2==0) ? '1' : '0';
                if(s1.charAt(i-n)!=p0) c0--;
                if(s1.charAt(i-n)!=p1) c1--;
            }
            if(i>=n-1)
            {
                min = Math.min(min,Math.min(c0,c1));
            }
        }
        return min;
    }
}