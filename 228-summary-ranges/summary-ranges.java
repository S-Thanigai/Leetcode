class Solution {
    public List<String> summaryRanges(int[] nums)
    {
        int len = nums.length;
        List<String> result = new ArrayList<>();
        if (len == 0) return result;

        int start = nums[0];
        for (int i = 1; i <= len; i++) {
            if (i == len || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < len) start = nums[i];
            }
        }
        return result;
    }
}