class Solution {
    public int candy(int[] ratings) 
    {
        int n = ratings.length;
        int[] candies = new int[n];

        Arrays.fill(candies,1);

        boolean updated=true;

        while(updated)
        {
            updated=false;
            for(int i=1;i<n;i++)
            {
                if(ratings[i]>ratings[i-1] && candies[i] <=candies[i-1])
                {
                    candies[i]=candies[i-1]+1;
                    updated=true;
                }
            }
            for(int i=n-2;i>=0;i--)
            {
                if(ratings[i]>ratings[i+1] && candies[i] <= candies[i+1])
                {
                    candies[i]=candies[i+1]+1;
                    updated=true;
                }
            }
        }
        int total=0;
        for(int candy:candies)
        {
            total+=candy;
        }
        return total;
    }
}