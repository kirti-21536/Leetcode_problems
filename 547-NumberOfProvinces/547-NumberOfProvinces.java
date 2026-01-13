// Last updated: 1/13/2026, 11:15:52 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                ans++;
            }
        }
        return ans;
        
    }
    public void dfs(int isConnected[][],boolean[] visited ,int city){
        visited[city]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j]==1 && !visited[j]){
                dfs(isConnected,visited,j);
            }
        }
    }
}