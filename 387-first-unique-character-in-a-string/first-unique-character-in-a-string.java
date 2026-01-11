class Solution
{
    public int firstUniqChar(String s)
    {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                return i;
            }
        }
        return -1;
    }
}