// Last updated: 5/11/2026, 5:07:40 PM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> ll=new ArrayList<>();
4        for(int n:nums){
5            if(n<9)ll.add(n);
6            else{
7                List<Integer> l=new ArrayList<>();
8                while(n>0){
9                    int r=n%10;
10                    l.add(r);
11                    n/=10;
12                }
13                Collections.reverse(l);
14                for(int a:l){
15                    ll.add(a);
16                }
17            }
18        }
19        int[] arr = new int[ll.size()];
20        for(int i = 0; i < ll.size(); i++) {
21            arr[i] = ll.get(i);
22        }
23        return arr;
24        
25    }
26}