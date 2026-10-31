class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);

        int n=nums.length;

        int closestSum=nums[0]+nums[1]+nums[2];
        int minDiff=Math.abs(closestSum-target);

        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;

            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(sum-target);
                
                if(minDiff > diff)
                {
                    minDiff=diff;
                    closestSum=sum;
                }

                if(sum==target)
                    return sum;
                
                else if(sum<target)
                    left++;
                else
                    right--;

            }
        }
        return closestSum;
    }
}