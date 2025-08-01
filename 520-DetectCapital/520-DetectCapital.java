// Last updated: 8/1/2025, 8:14:51 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int caps=0;
        int first=0;
        int low=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A'&& ch<='Z'){caps++;
            if(first==0){
                first=1;
            }
            }
            else{
                low++;
                if(first==0){
                    first=2;
                }
            }
        }
        if(caps==0||low==0||caps==1&&first==1){
            return true;
        }
        else return false;

       
    }
}