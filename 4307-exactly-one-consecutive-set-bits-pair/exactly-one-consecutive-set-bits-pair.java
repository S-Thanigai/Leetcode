class Solution {
    public boolean consecutiveSetBits(int n)
    {
        String num = Integer.toBinaryString(n);
        int len = num.length();
        int c = 0;
        for(int i=0;i<len-1;i++)
        {
            String str = num.substring(i,i+2);
            if(str.equals("11"))
            {
                c+=1;
            }
        }
        return c==1;
    }
}