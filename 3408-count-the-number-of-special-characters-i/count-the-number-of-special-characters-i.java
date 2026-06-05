class Solution {
    public int numberOfSpecialChars(String word)
    {
        int arr[] = new int[58];
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            arr[ch-'A']++;
        }
        int c = 0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0 && arr[i+32]!=0)
            {
                c+=1;
            }
        }
        return c;
    }
}