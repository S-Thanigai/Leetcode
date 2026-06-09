class Solution {
    public int[] replaceElements(int[] arr)
    {
        int larg = -1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int curr = arr[i];
            arr[i] = larg;
            larg = Math.max(larg,curr);
        }
        return arr;
    }
}