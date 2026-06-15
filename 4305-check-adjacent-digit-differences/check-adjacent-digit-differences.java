class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s)
    {
        int len = s.length();
        for(int i=0;i<len-1;i++)
        {
            int f = s.charAt(i)-'0';
            int g = s.charAt(i+1)-'0';
            if(Math.abs(f-g)>2)
            {
                return false;
            }
        }
        return true;
    }
}