// Last updated: 8/14/2025, 11:48:09 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isvowel(arr[i])){
                i++; 
            }
            else if(!isvowel(arr[j])){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    private static boolean isvowel(char y){
         y=Character.toLowerCase(y);
        if(y == 'a' || y == 'e' || y == 'i' || y == 'o'|| y == 'u'){
            return true;
        }
        return false;

    }
}