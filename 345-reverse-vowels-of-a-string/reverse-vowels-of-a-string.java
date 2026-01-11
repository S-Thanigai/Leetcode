class Solution {
    public String reverseVowels(String s)
    {
        char arr[] = s.toCharArray();
        int l = 0;
        int r = arr.length-1;
        String v = "aeiouAEIOU";
        while(l<r)
        {
            while(l<r && v.indexOf(arr[l])==-1)
            {
                l++;
            }
            while(l<r && v.indexOf(arr[r])==-1)
            {
                r--;
            }
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        return new String(arr);
    }
}