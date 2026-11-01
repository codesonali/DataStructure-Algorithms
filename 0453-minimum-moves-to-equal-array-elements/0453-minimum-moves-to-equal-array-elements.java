class Solution {
    public int minMoves(int[] nums) 
    {
        //Incrementing n - 1 elements by 1 is equivalent to decrementing one element by 1 for the purpose of making all elements equal.
        //This is the key to solving the problem!
        //Our goal is to make all elements equal.
        // To achieve this with minimum operations, we should bring every element down to the smallest element.
        // Why the smallest?
        // Because decrementing elements cannot increase them. So the only possible common target that requires the fewest decrements is the minimum element.

        int min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            min=Math.min(min,num);
        }
        int moves=0;
        for(int num:nums)
        {
            moves+=num-min;
        }
        return moves;
    }
}