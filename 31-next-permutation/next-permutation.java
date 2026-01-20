class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;

        // Step 1: find breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: if no breakpoint, reverse whole array
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: find next greater element
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }

        // Step 4: reverse suffix
        reverse(arr, ind + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
