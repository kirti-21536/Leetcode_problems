// Last updated: 1/30/2026, 12:30:10 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue<int[]> q= new LinkedList<>();
4        int n=tickets.length;
5        int time=0;
6        for(int i=0;i<n;i++){
7            q.add(new int[]{tickets[i],i});
8        }
9        while(!q.isEmpty()){
10            int arr[]=q.remove();
11            time++;
12            arr[0]--;
13            if(arr[1]==k && arr[0]==0){
14                return time;
15            }
16            if(arr[0]>0)q.add(arr);
17            
18        }
19        return 0;
20    }
21}