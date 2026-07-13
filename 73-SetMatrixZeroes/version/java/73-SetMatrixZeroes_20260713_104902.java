// Last updated: 7/13/2026, 10:49:02 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5        HashSet<Integer> rows=new HashSet<>();
6        HashSet<Integer> cols=new HashSet<>();
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                if(matrix[i][j]==0){
10                    rows.add(i);
11                    cols.add(j);
12                }
13            }
14        }
15        for(Integer a:rows){
16            set_row(matrix,a);
17        }
18        for(Integer a:cols){
19            set_col(matrix,a);
20        }
21
22        
23    }
24    public static void set_row(int matrix[][],int i){
25        for(int k=0;k<matrix[0].length;k++){
26            matrix[i][k]=0;
27        }
28    }
29    public static void set_col(int matrix[][],int j){
30        for(int k=0;k<matrix.length;k++){
31            matrix[k][j]=0;
32        }
33    }
34}