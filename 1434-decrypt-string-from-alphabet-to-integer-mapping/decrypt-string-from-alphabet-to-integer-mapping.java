class Solution {
    public String freqAlphabets(String s)
    {
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            {
                int num = Integer.parseInt(s.substring(i-2, i));
                char curr = (char)('a' + num - 1);
                res.append(curr);
                i-=2;
            }
            else
            {
                int num = s.charAt(i) - '0';
                char curr = (char)('a' + num - 1);
                res.append(curr);
            }
        }
        return res.reverse().toString();
    }
}