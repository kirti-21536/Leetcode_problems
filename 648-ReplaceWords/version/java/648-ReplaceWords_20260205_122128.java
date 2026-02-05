// Last updated: 2/5/2026, 12:21:28 PM
1    class Trie{
2        class Node{
3        char ch;
4        String isterminal;
5        HashMap<Character,Node> child;
6        public Node(char ch){
7            this.ch=ch;
8            child=new HashMap<>();
9        }
10     
11    }
12    private Node root=new Node('*');
13    public String search(String word){
14        Node curr=root;
15        for(int i=0;i<word.length();i++){
16            char ch=word.charAt(i);
17            if(curr.child.containsKey(ch)){
18                curr=curr.child.get(ch);
19                if(curr.isterminal!=null){
20                    return curr.isterminal;
21                }
22            }
23            else{
24                return word;
25            }
26        }
27        return word;
28    }
29    
30    public void insert(String word){
31        Node curr=root;
32        for(int i=0;i<word.length();i++){
33            char ch=word.charAt(i);
34            if(curr.child.containsKey(ch)){
35                curr=curr.child.get(ch);
36            }
37            else{
38                Node nn=new Node(ch);
39                curr.child.put(ch,nn);
40                curr=nn;
41            }
42        }
43        curr.isterminal=word;
44
45    }
46    }
47    class Solution {
48    public String replaceWords(List<String> dictionary, String sentence) {
49        Trie t=new Trie();
50        for(String s:dictionary){
51            t.insert(s);
52        }
53        String arr[]=sentence.split(" ");
54        StringBuilder sb=new StringBuilder();
55        for(int i=0;i<arr.length;i++){
56            String get=(t.search(arr[i]));
57            sb.append(get+" ");
58        }
59        return sb.toString().trim();
60        
61    }
62    
63}  
64