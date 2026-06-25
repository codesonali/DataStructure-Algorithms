class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int n=x;
        int r;
        int d=0;
        while(n != 0)
        {
            r = n%10;
            d=d*10+r;
            n=n/10;
        }
        if(d==x)
            return true;
        else
            return false;
    }
}