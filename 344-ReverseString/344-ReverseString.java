// Last updated: 8/1/2025, 8:15:03 PM
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
    //  List al = Arrays.asList(s);
    // System.out.print(al);
    }
}