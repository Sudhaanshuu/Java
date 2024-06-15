package suku;

class Sukuu {
    Long dp[][][];
    public long  dfs(int arr[][],int n,int i,int j)
    {

        if(i<0 || j<0 || i>=4 || j>=3 || arr[i][j]==-1)
            return 0;

        if(n==1)
        {
            return 1;
        }
        if(dp[i][j][n]!=null)
            return dp[i][j][n];
        long a=0,b=0,c=0,d=0,e=0;

        e=dfs(arr,n-1,i,j);
        a=dfs(arr,n-1,i+1,j);
        b=dfs(arr,n-1,i-1,j);
        c=dfs(arr,n-1,i,j+1);
        d=dfs(arr,n-1,i,j-1);
        return dp[i][j][n]=a+b+c+d+e;
    }
    public long getCount(int n) {
        // Your code goes here
        dp=new Long[4][3][n+1];
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        long count=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]!=-1)
                {
                    count+=dfs(arr,n,i,j);
                }
            }
        }
        return count;

    }
}
