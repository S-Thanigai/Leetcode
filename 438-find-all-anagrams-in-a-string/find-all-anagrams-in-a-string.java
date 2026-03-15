class Solution {
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> li = new ArrayList<>();
        int w = p.length();
        int l = s.length();
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(char c:p.toCharArray())
        {
            f1[c-'a']++;
        }
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            f2[c-'a']++;
            if(i>=w)
            {
                f2[s.charAt(i-w)-'a']--;
            }
            if(Arrays.equals(f1,f2))
            {
                li.add(i-w+1);
            }
        }
        return li;
    }
}