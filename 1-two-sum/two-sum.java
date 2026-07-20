class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> se = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(se.containsKey(target-nums[i]))
            {
                return new int[] {se.get(target-nums[i]),i};
            }
            se.put(nums[i],i);
        }
        return new int[] {};
    }
}