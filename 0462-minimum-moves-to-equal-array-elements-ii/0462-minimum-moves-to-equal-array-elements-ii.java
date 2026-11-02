class Solution {
    public int minMoves2(int[] nums) 
    {
        Arrays.sort(nums);

        long median=nums[nums.length/2];
        long moves=0;

        for(long num:nums)
        {
            moves+=Math.abs(num-median);
        }
        return (int)moves;
    }
}