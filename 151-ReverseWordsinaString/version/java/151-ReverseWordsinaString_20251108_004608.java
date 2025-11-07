// Last updated: 11/8/2025, 12:46:08 AM
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