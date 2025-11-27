// Last updated: 11/27/2025, 11:45:56 PM
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