// Last updated: 8/1/2025, 8:14:14 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        String merged="";
        int i=0;
        for(;i<min;i++){
            merged=merged+word1.charAt(i)+word2.charAt(i)+"";
        } 
       
        if(a>b){
            merged=merged+word1.substring(i,max); 

        }
        else if(b>a){
            merged=merged+word2.substring(i,max);

        }
       return merged;
        
         }
}