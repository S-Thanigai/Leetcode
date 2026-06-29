class Solution {
    public int numOfStrings(String[] patterns, String word)
    {
        int ans = 0;
        for(String pat : patterns)
        {
            if(word.contains(pat))
            {
                ans+=1;
            }
        }
        return ans;
    }
}