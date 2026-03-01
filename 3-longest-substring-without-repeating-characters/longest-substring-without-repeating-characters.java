class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int arr[] = new int[128];
        int l = 0;
        int ml = 0;
        for(int r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            arr[c]++;
            while(arr[c] > 1)
            {
                arr[s.charAt(l)]--;
                l++;
            }
            ml = Math.max(ml,r-l+1);
        }
        return ml;
    }
}