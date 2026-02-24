// Last updated: 2/24/2026, 3:47:54 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        long score[]=new long[edges.length];
4        for(int i=0;i<edges.length;i++){
5            score[edges[i]]+=i;
6        }
7        long max=-1;
8        int idx=-1;
9        for(int i=0;i<edges.length;i++){
10            if(score[i]>max){
11                max=score[i];
12                idx=i;
13            }
14        }
15        return idx;
16    }
17}