// Last updated: 10/29/2025, 10:44:51 AM
class Solution {
    public int smallestNumber(int n) {
        int num=n;
        while(num<=Integer.MAX_VALUE){
            int temp=num;
            boolean flag=true;
            String ans="";
            while(temp>0){
                int rem=temp%2;
                ans=rem+ans;
                temp=temp/2;
            }
            for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)=='0'){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return num;
            }
            else{
                num++;
            }

        }
        return n;
    }
}