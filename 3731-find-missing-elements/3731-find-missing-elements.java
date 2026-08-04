class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num : nums)
        {
            set.add(num);
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        // Collections.sort(list);
        return list;


    }
}