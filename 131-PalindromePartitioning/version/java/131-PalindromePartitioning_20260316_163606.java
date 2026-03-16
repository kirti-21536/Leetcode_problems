// Last updated: 3/16/2026, 4:36:06 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans=new ArrayList<>();
4        List<String> ll=new ArrayList<>();
5        partitioning(s,ll,ans);
6        return ans;
7        
8    }
9    public void partitioning(String ques,List<String> ll,List<List<String>> ans){
10        if(ques.length()==0){
11            ans.add(new ArrayList<>(ll));
12            return;
13        }
14        for(int i=1;i<=ques.length();i++){
15            String s=ques.substring(0,i);
16            if(ispalindrome(s)){
17                ll.add(s);
18                partitioning(ques.substring(i),ll,ans);
19                ll.remove(ll.size()-1);
20            }
21        }
22    } 
23    public boolean ispalindrome(String s){
24        int i=0;
25        int j=s.length()-1;
26        while(i<j){
27            if(s.charAt(i)!=s.charAt(j)){
28                return false;
29            }
30            i++;
31            j--;
32        }
33        return true;
34    }
35}