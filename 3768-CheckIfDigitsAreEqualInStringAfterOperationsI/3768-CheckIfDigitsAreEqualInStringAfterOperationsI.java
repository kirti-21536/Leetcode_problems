// Last updated: 11/27/2025, 11:45:40 PM
class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String sb="";
            for(int i=0;i<s.length()-1;i++){
                int ch=Integer.parseInt(s.charAt(i)+"");
                int ch1=Integer.parseInt(s.charAt(i+1)+"");
                int sum=(ch+ch1)%10;
                sb+=sum+"";
            }
            if(sb.length()==2){
                if(sb.charAt(0)==sb.charAt(1))return true;
            }
            s=sb;
        }
        if(s.length()==2){
                if(s.charAt(0)==s.charAt(1))return true;
            }

       return false; 
    }
}