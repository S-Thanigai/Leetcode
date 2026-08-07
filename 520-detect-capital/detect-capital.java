class Solution {
    public boolean detectCapitalUse(String word)
    {
        int c = 0;
        for(char ch:word.toCharArray())
        {
            if("QWERTYUIOPASDFGHJKLZXCVBNM".indexOf(ch)!=-1)
            {
                c+=1;
            }
        }
        if(c==word.length())
        {
            return true;
        }
        if(c==0)
        {
            return true;
        }
        if(c==1 && word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            return true;
        }
        return false;
    }
}