class Solution {
    public char nextGreatestLetter(char[] letters, char target)
    {
        int l = letters.length;
        int arr[] = new int[26]; 
        for(int i=0;i<l;i++)
        {
            arr[letters[i]-'a']++;
        }
        int tc = target - 'a';
        int next = 0;
        boolean flag = false;
        for(int i=tc+1;i<26;i++)
        {
            if(arr[i]!=0)
            {
                next = i+97;
                flag = true;
                break;
            }
        }
        if(flag)
        {
            return (char)next;
        }
        else
        {
            return letters[0];
        }    
    }
}