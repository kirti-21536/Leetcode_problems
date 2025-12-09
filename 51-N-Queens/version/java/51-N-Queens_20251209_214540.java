// Last updated: 12/9/2025, 9:45:40 PM
1import java.util.ArrayList;
2
3class Solution {
4
5    public List<List<String>> solveNQueens(int n) {
6        Boolean[][] board=new Boolean[n][n];
7        List<List<String>> res =new ArrayList<>();
8        for(Boolean arr[]:board){
9            Arrays.fill(arr,false);
10        }
11        print(board,0,n,res);
12        return res;
13         
14    }
15    public static void print(Boolean[][] board,int row ,int tq,List<List<String>> res){
16        if(tq==0){
17            res.add(Display(board));
18            return;
19        }
20        for(int col=0;col<board[0].length;col++){
21            if(isitsafe(board,row,col)){
22                board[row][col]=true;
23                print(board,row+1,tq-1,res);
24                board[row][col]=false;
25            }
26        }
27    }
28    public static boolean isitsafe(Boolean[][] board,int row ,int col){
29        //up
30        int r=row;
31        while(r>=0){
32            if(board[r][col]){
33                return false;
34            }
35            r--;
36        }  
37        //diagonal left
38        r=row;
39        int c=col;
40        while(r>=0 && c>=0){
41            if(board[r][c]){
42                return false;
43            }
44            r--;
45            c--;
46        }
47        //diagonal right
48        r=row;
49        c=col;
50        while(r>=0 && c<board[0].length){
51            if(board[r][c]){
52                return false;
53            }
54            c++;
55            r--;
56        } 
57        return true;
58        }
59
60        public static List<String> Display(Boolean[][] board){
61            List<String> temp=new ArrayList<>();
62            for(int i=0;i<board.length;i++){
63                String st="";
64                for(int j=0;j<board[0].length;j++){
65                    if(board[i][j]){
66                        st+="Q";
67                    }
68                    else{
69                        st+=".";
70                    }
71                }
72                temp.add(st);
73            }
74            return temp;
75        }
76}