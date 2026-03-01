class Solution {
    public String reversePrefix(String word, char ch)
    {
        char arr[] = word.toCharArray();
        int ind = word.indexOf(ch);
        if(ind==-1)
        {
            return word;
        }
        int l = 0;
        while(l<ind)
        {
            char temp = arr[l];
            arr[l] = arr[ind];
            arr[ind] = temp;
            l++;
            ind--;
        }
        return new String(arr);
    }
}