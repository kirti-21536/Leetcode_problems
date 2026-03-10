// Last updated: 3/10/2026, 3:45:32 PM
1class Solution {
2    public int compress(char[] chars) {
3        if(chars.length==1){
4            return 1;
5        }
6        int i=0; //reading position
7        int j=0; //writing pointer
8        while(i<chars.length){
9            char curr=chars[i];
10            int count=0;
11            while(i<chars.length && curr==chars[i]){
12                count++;
13                i++;
14            }
15            chars[j++]=curr;
16            if(count>1){
17                String c=String.valueOf(count);
18                for(char s:c.toCharArray()){
19                    chars[j++]=s;
20                }
21            }
22        }
23        return j;
24        
25}
26}