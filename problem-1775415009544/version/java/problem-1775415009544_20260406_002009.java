// Last updated: 4/6/2026, 12:20:09 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int vertical = 0;
4        int horizontal = 0;
5
6        for(char ch : moves.toCharArray()) {
7            if(ch == 'U') vertical++;
8            else if(ch == 'D') vertical--;
9            else if(ch == 'R') horizontal++;
10            else if(ch == 'L') horizontal--;
11        }
12
13        return vertical == 0 && horizontal == 0;
14    }
15}