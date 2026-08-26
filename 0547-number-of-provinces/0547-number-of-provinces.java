class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int n=isConnected.length;
        int[]vis=new int[n];
        int provinces=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                provinces++;
                dfs(i,isConnected,vis);
            }
        }
        return provinces;
    }
    void dfs(int i,int[][] isConnected,int[] vis)
    {
        vis[i]=1;

        for(int j=0; j< isConnected.length ;j++)
        {
            if(isConnected[i][j]==1 && vis[j]==0)
            {
                dfs(j,isConnected,vis);
            }
        }
    }
}