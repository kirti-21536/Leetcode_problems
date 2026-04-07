// Last updated: 4/7/2026, 11:50:36 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        int letter[]=new int[26];
4        int digit[]=new int[10];
5        for(char ch:s.toCharArray()){
6            if(ch>='0'&& ch<='9'){
7                digit[ch-'0']++;
8            }
9            else {
10                letter[ch-'a']++;
11            }
12        }
13        int sum=0;
14        for(int i=0;i<13;i++){
15            sum+=Math.abs(letter[i]-letter[25-i]);
16        }
17        for(int i=0;i<5;i++){
18            sum+=Math.abs(digit[i]-digit[9-i]);
19        }
20        
21        return sum;    
22}
23}