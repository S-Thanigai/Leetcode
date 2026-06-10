class Solution {
    public String greatestLetter(String s)
    {
        int arr[] = new int[128];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }
        for(char ch = 'Z';ch>='A';ch--)
        {
            if(arr[ch] > 0 && arr[ch+32] > 0)
            {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}