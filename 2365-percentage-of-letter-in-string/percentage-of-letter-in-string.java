class Solution {
    public int percentageLetter(String s, char letter)
    {
        int c = 0;
        int len = s.length();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==letter)
            {
                c+=1;
            }
        }
        return (c*100) / len;
    }
}