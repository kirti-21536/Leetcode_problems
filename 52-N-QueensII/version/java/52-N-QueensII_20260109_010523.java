// Last updated: 1/9/2026, 1:05:23 AM
1class Solution {
2    public int totalNQueens(int n) {
3        Boolean[][] board=new Boolean[n][n];
4        List<List<String>> res =new ArrayList<>();
5        for(Boolean arr[]:board){
6            Arrays.fill(arr,false);
7        }
8        print(board,0,n,res);
9        return res.size();
10         
11    }
12    public static void print(Boolean[][] board,int row ,int tq,List<List<String>> res){
13        if(tq==0){
14            res.add(Display(board));
15            return;
16        }
17        for(int col=0;col<board[0].length;col++){
18            if(isitsafe(board,row,col)){
19                board[row][col]=true;
20                print(board,row+1,tq-1,res);
21                board[row][col]=false;
22            }
23        }
24    }
25    public static boolean isitsafe(Boolean[][] board,int row ,int col){
26        //up
27        int r=row;
28        while(r>=0){
29            if(board[r][col]){
30                return false;
31            }
32            r--;
33        }  
34        //diagonal left
35        r=row;
36        int c=col;
37        while(r>=0 && c>=0){
38            if(board[r][c]){
39                return false;
40            }
41            r--;
42            c--;
43        }
44        //diagonal right
45        r=row;
46        c=col;
47        while(r>=0 && c<board[0].length){
48            if(board[r][c]){
49                return false;
50            }
51            c++;
52            r--;
53        } 
54        return true;
55        }
56
57        public static List<String> Display(Boolean[][] board){
58            List<String> temp=new ArrayList<>();
59            for(int i=0;i<board.length;i++){
60                String st="";
61                for(int j=0;j<board[0].length;j++){
62                    if(board[i][j]){
63                        st+="Q";
64                    }
65                    else{
66                        st+=".";
67                    }
68                }
69                temp.add(st);
70            }
71            return temp;
72        }
73        
74    }
75