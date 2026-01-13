// Last updated: 1/13/2026, 11:10:46 AM
class Solution {
    public String generateTag(String caption) {
        String arr[]=caption.trim().split("\\s+");
        if(caption.length()==0)return "#";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(i==0){
                sb.append(s.toLowerCase());
            }
            else{
            String ans=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
            sb.append(ans);
            }
            
        }
        String a="#"+sb.toString();

        return a.length()>100?a.substring(0,100):a;
        
    }
}