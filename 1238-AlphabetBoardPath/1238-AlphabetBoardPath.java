// Last updated: 1/13/2026, 11:13:05 AM
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sb=new StringBuilder();
        int row=0;
        int col=0;
        for(char ch:target.toCharArray()){
            int tar_row=(ch-'a')/5;
            int tar_col=(ch-'a')%5;
            if(ch=='z'){
                while(col>tar_col){
                    sb.append('L');
                    col--;
                }
                while(col<tar_col){
                    sb.append('R');
                    col++;
                }
                while(row>tar_row){
                    sb.append('U');
                    row--;
                }
                while(row<tar_row){
                    sb.append('D');
                    row++;
                }
            }
            else{
                while(row>tar_row){
                    sb.append('U');
                    row--;
                }
                while(row<tar_row){
                    sb.append('D');
                    row++;
                }
                    while(col>tar_col){
                        sb.append('L');
                        col--;
                    }
                    while(col<tar_col){
                        sb.append('R');
                        col++;
                    }
                }
            sb.append('!');
            }
        return sb.toString();
        
    }
}