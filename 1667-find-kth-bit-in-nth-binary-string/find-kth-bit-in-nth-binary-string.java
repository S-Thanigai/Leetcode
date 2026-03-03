class Solution {
    public char findKthBit(int n, int k)
    {
        String str = "0";
        for(int i=1;i<n;i++)
        {
            String in = invert(str);
            String re = reverse(in);
            str = str + "1" + re;
        }
        return str.charAt(k-1);
    }
    public String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String invert(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                sb.append('1');
            }
            else
            {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}