// Last updated: 12/5/2025, 1:19:03 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int m =matrix.length;
4        int n = matrix[0].length;
5        //transpose of the matrix
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(i<j){
9                    int temp=matrix[i][j];
10                    matrix[i][j]=matrix[j][i];
11                    matrix[j][i]=temp;
12                }
13            }
14        }
15        //reverse of matrix
16        for(int i=0;i<m;i++){
17            for(int j=0;j<m/2;j++){
18                int temp=0;
19                temp=matrix[i][j];
20                matrix[i][j]=matrix[i][m-1-j]; //mirror index is  [m-1-j]
21                matrix[i][m-1-j]=temp;
22            }
23        }
24        
25
26        
27    }
28}