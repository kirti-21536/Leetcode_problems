// Last updated: 10/14/2025, 12:44:42 AM
class Solution {
    public boolean winnerOfGame(String colors) {
        int Amove=0,Bmove=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i-1) && colors.charAt(i)==colors.charAt(i+1)){
                if(colors.charAt(i)=='A'){
                    Amove++;
                }
                else Bmove++;
            }
        }
       return Amove>Bmove;
    }
}