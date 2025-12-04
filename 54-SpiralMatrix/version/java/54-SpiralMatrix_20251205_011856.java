// Last updated: 12/5/2025, 1:18:56 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List a = new ArrayList();
4        int maxr=matrix.length-1;
5        int minr=0;
6        int minc=0;
7        int maxc=matrix[0].length-1;
8        int te=matrix.length*matrix[0].length;
9    int c=0;
10    while(c<te){
11        for(int i=minc;i<=maxc &&c<te;i++){
12            a.add(matrix[minr][i]);
13            c++;
14        }
15        minr++;
16        for(int i=minr;i<=maxr &&c<te;i++){
17            a.add(matrix[i][maxc]);
18            c++;
19        }
20        maxc--;
21        for(int i=maxc;i>=minc &&c<te;i--){
22            a.add(matrix[maxr][i]);
23            c++;
24        }
25        maxr--;
26        for(int i=maxr;i>=minr &&c<te;i--){
27            a.add(matrix[i][minc]);
28            c++;
29        }
30        minc++;
31    }
32return a;
33
34    
35    }
36}