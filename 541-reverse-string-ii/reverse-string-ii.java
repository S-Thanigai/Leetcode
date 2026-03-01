class Solution {
    public String reverseStr(String s, int k)
    {
        char arr[] = s.toCharArray();
        int len = s.length();
        for(int i=0;i<len;i+=2*k)
        {
            int l = i;
            int r = Math.min(i+k-1,len-1);
            while(l<r)
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}