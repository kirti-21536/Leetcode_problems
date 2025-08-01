// Last updated: 8/1/2025, 8:15:42 PM
class Solution {
    public String reverseWords(String s) {
        
        String arr[]=s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
        ans=ans+arr[i]+" ";
    }
     return ans.trim();
    
        
    }
}