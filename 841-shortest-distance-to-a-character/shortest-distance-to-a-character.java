class Solution {
    public int[] shortestToChar(String s, char c)
    {
        int len = s.length();
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
        {
            int ld = Integer.MAX_VALUE;
            int rd = Integer.MAX_VALUE;
            int lj = i;
            int rj = i;
            while(lj>=0)
            {
                if(s.charAt(lj)==c)
                {
                    ld = i-lj;
                    break;
                }
                lj--;
            }
            while(rj<len)
            {
                if(s.charAt(rj)==c)
                {
                    rd = rj - i;
                    break;
                }
                rj++;
            }
            arr[i] = Math.min(ld,rd);
        }
        return arr;
    }
}