class Solution {
    public boolean checkInclusion(String s1, String s2)
    {
        int w = s1.length();
        int l = s2.length();
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(char c:s1.toCharArray())
        {
            f1[c-'a']++;
        }

        for(int i=0;i<l;i++)
        {
            char c = s2.charAt(i);
            f2[c-'a']++;
            if(i>=w)
            {
                f2[s2.charAt(i-w)-'a']--;
            }
            if(Arrays.equals(f1,f2))
            {
                return true;
            }
        }
        return false;
    }
}