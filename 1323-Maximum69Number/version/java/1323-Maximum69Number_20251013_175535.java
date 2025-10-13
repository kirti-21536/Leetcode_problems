// Last updated: 10/13/2025, 5:55:35 PM
class Solution {
    public int maximum69Number (int num) {
        // char[] arr = String.valueOf(num).toCharArray();
        // for(int a=0;a<arr.length;a++){
        //     if(arr[a]=='6'){
        //         arr[a]='9';
        //         break;
        //     }
        // }
        // int ans = Integer.parseInt(new String(arr));
        // return ans;
        String n=num+"";
        String ans="";
        char arr[]=n.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        for(char c:arr){
            ans+=c+"";        }
            return Integer.parseInt(ans);
    }
}