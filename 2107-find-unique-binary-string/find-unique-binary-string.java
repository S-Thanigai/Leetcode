class Solution {
    public String findDifferentBinaryString(String[] nums)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            String s = nums[i];
            if(s.charAt(i)=='1')
            {
                sb.append('0');
            }
            else
            {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}