class Solution {
    public String reverseWords(String s)
    {
        char arr[] = s.toCharArray();
        int l = 0;
        int r = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                r = i - 1;
                while(l < r)
                {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
                l = i + 1;
            }
        }
        r = arr.length - 1;
        while(l < r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}