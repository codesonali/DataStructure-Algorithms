class Solution {
    public int maxLength(int[] nums) 
    {
        int n=nums.length;
        int maxLen=0;

        for(int i=0;i<n;i++)
        {
            long product=1;
            long lcm=1;
            int gcd=0;
            for(int j=i;j<n;j++)
            {
                product*=nums[j];
                gcd = gcd(gcd, nums[j]);
                long currentGcd = gcd((int)lcm, nums[j]);
                lcm = (lcm / currentGcd) * nums[j];

                // Check the required condition
                if (product == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // Function to calculate GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}