// Last updated: 1/21/2026, 12:35:36 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int setbits=0;
4        while(num2!=0){
5            num2=(num2 & (num2-1));
6            setbits++;
7        }
8        int x=0;
9        for(int i=30;i>=0;i--){
10            int mask=(1<<i);
11            if((num1&mask)!=0){
12                x|=mask;
13                setbits--;
14                if(setbits==0){
15                    return x;
16                }
17            }
18        }
19         for(int i=0;i<=30;i++){
20            int mask=(1<<i);
21            if((num1&mask)==0){
22                x|=mask;
23                setbits--;
24                if(setbits==0){
25                    return x;
26                }
27            }
28        }
29        return x;
30    }
31}