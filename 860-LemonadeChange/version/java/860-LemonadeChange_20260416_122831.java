// Last updated: 4/16/2026, 12:28:31 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        // we will maintain the count of 5s and 10s;
4        int five=0,ten=0;
5        for(int i=0;i<bills.length;i++){
6            if(bills[i]==5)five++;
7            else if(bills[i]==10){
8                if(five>0){
9                    five--;
10                    ten++;
11                }
12                else return false;
13            }
14            else{
15                if(five>0 && ten>0){
16                    five--;
17                    ten--;
18                }
19                else if(five>=3){
20                    five-=3;
21                }
22                else return false;
23            }
24        }
25        return true;
26        
27    }
28}