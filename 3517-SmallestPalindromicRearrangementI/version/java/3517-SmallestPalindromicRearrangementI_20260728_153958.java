// Last updated: 7/28/2026, 3:39:58 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        if(s.length()==1)return s;
4        int []freq=new int[26];
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            freq[ch-'a']++;
8        }
9        StringBuilder left=new StringBuilder();
10        StringBuilder mid=new StringBuilder();
11        for(int i=0;i<26;i++){
12            char ch=(char)('a'+i);
13            int count=freq[i]/2;
14            if(freq[i]%2==1){
15                mid.append(ch);
16            }
17            while(count-->0){
18                    left=left.append(ch);
19                }
20        }
21        StringBuilder right=new StringBuilder(left).reverse();
22        return (left.append(mid)).append(right).toString();
23    }
24}