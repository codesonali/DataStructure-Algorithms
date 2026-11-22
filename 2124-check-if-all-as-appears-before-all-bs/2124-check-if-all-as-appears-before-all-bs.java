class Solution {
    public boolean checkString(String s) 
    {
        int idx=s.indexOf('b');
        if(idx==-1)
        {
            return true;
        }

        for(int i=idx;i<s.length()-1;i++)
        {
            if(s.charAt(i+1)=='a')
            {
                return false;
            }
        }
        return true;
    }
}