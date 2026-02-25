class Solution {
    public int[] sortByBits(int[] arr)
    {
        Arrays.sort(arr);   // needed for tie-breaking

        int l = arr.length;
        int res[] = new int[l];
        int k = 0;
        for (int b = 0; b <= 14; b++) {
            for (int i = 0; i < l; i++) {
                if (Integer.bitCount(arr[i]) == b) {
                    res[k++] = arr[i];
                }
            }
        }
        return res;
    }
}