class Solution {
    public String reverseByType(String s) {
        int l = 0;
        int r = s.length() - 1;
        char arr[] = s.toCharArray();

        while (l < r) {
            while (l < r && !Character.isLetter(arr[l])) {
                l++;
            }
            while (l < r && !Character.isLetter(arr[r])) {
                r--;
            }

            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        l = 0;
        r = s.length() - 1;

        while (l < r) {
            while (l < r && Character.isLetter(arr[l])) {
                l++;
            }
            while (l < r && Character.isLetter(arr[r])) {
                r--;
            }

            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(arr);
    }
}