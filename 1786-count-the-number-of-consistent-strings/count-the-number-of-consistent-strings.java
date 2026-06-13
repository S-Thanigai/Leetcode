class Solution {
    public int countConsistentStrings(String allowed, String[] words)
    {
        int arr[] = new int[26];
        for(int i=0;i<allowed.length();i++)
        {
            arr[allowed.charAt(i)-'a']++;
        }
        int c = 0;
        for(String w:words)
        {
            boolean flag = true;
            for(int i=0;i<w.length();i++)
            {
                if(arr[w.charAt(i)-'a']==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                c+=1;
            }
        }
        return c;
    }
}