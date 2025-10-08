// Last updated: 10/8/2025, 11:34:52 AM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int dp[][]=new int[matrix.length][matrix[0].length];
        for(int []a:dp){
            Arrays.fill(a,-66666);
        }
        for(int col=0;col<matrix[0].length;col++){
            ans=Math.min(ans,min_path(matrix,0,col,dp));
        }
        return ans;
        
    }
    public static int min_path(int matrix[][],int cr,int cc,int dp[][]){
        if(cr==matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            if(i==cc)continue;
            ans=Math.min(ans,min_path(matrix,cr+1,i,dp));
        }
        // int ld=min_path(matrix,cr+1,cc-1,dp);
        // int rd=min_path(matrix,cr+1,cc+1,dp);
        // int d=min_path(matrix,cr+1,cc,dp);
        return dp[cr][cc]=ans+matrix[cr][cc];
    }    
    }
