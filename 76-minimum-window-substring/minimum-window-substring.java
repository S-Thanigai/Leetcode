class Solution {
    public String minWindow(String s, String t)
    {
        int sl = s.length();
        int tl = t.length();
        if(tl>sl)
        {
            return "";
        }
        int arr[] = new int[128];
        for(char ch:t.toCharArray())
        {
            arr[ch]++;
        }
        int l = 0;
        int c = t.length();
        int str = 0;
        int ml = Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++)
        {
            if(arr[s.charAt(r)]>0)
            {
                c--;
            }
            arr[s.charAt(r)]--;
            while(c==0)
            {
                int le = r-l+1;
                if(le<ml)
                {
                    ml=le;
                    str=l;
                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)]>0)
                {
                    c+=1;
                }
                l++;
            }
        }
        return ml==Integer.MAX_VALUE ? "" : s.substring(str,str+ml);
    }
}