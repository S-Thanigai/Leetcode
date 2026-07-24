class Solution {
    public String replaceDigits(String s)
    {
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                arr[i] = (char)((arr[i-1]-'a')+(arr[i]-'0')+'a');
            }
        }
        return new String(arr);
    }
}