class Solution {
    public String removeTrailingZeros(String num)
    {
        int l = num.length()-1;
        int c = 0;
        for(int i=l;i>=0;i--)
        {
            if(num.charAt(i)=='0')
            {
                continue;
            }
            else
            {
                c=i;
                break;
            }
        }
        return num.substring(0,c+1);
    }
}