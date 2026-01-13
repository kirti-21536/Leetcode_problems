// Last updated: 1/13/2026, 11:12:17 AM
class Solution {
    public String arrangeWords(String text) {
        String arr[]=text.trim().split("\\s+");
        StringBuilder sb= new StringBuilder();
        Arrays.sort(arr,(a,b)->a.length()-b.length());
        for(int i=0;i<arr.length;i++){
            String a=arr[i];
            if(i==0){
                sb.append(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase());
            }
            else{
                sb.append(" "+a.toLowerCase());
            }

        }
        return sb.toString();
        
    }
}