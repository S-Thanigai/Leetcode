class Solution {
    public int countCharacters(String[] words, String chars)
    {
        int arr[] = new int[26];
        for(int i=0;i<chars.length();i++)
        {
            arr[chars.charAt(i)-'a']++;
        }
        int len = 0;
        for(int i=0;i<words.length;i++)
        {
            int cop[] = arr.clone();
            boolean fl = true;
            String wo = words[i];
            for(int j=0;j<wo.length();j++)
            {
                cop[wo.charAt(j)-'a']--;
            }
            for(int k=0;k<26;k++)
            {
                if(cop[k]<0)
                {
                    fl = false;
                    break;
                }
            }
            if(fl)
            {
                len+=words[i].length();
            }
        }
        return len;
    }
}