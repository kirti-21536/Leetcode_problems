// Last updated: 5/29/2026, 12:46:24 AM
1class Solution {
2
3    class TrieNode {
4        TrieNode[] child = new TrieNode[26];
5        int bestIndex = -1;
6    }
7
8    String[] wordsContainer;
9    TrieNode root = new TrieNode();
10
11    // choose better index according to rules
12    int better(int a, int b) {
13        if (a == -1) return b;
14
15        if (wordsContainer[a].length() != wordsContainer[b].length()) {
16            return wordsContainer[a].length() < wordsContainer[b].length() ? a : b;
17        }
18
19        return Math.min(a, b);
20    }
21
22    void insert(String word, int index) {
23        TrieNode node = root;
24
25        node.bestIndex = better(node.bestIndex, index);
26
27        for (int i = word.length() - 1; i >= 0; i--) {
28            int c = word.charAt(i) - 'a';
29
30            if (node.child[c] == null) {
31                node.child[c] = new TrieNode();
32            }
33
34            node = node.child[c];
35
36            node.bestIndex = better(node.bestIndex, index);
37        }
38    }
39
40    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
41
42        this.wordsContainer = wordsContainer;
43
44        // build trie
45        for (int i = 0; i < wordsContainer.length; i++) {
46            insert(wordsContainer[i], i);
47        }
48
49        int[] ans = new int[wordsQuery.length];
50
51        for (int i = 0; i < wordsQuery.length; i++) {
52
53            TrieNode node = root;
54
55            for (int j = wordsQuery[i].length() - 1; j >= 0; j--) {
56
57                int c = wordsQuery[i].charAt(j) - 'a';
58
59                if (node.child[c] == null) break;
60
61                node = node.child[c];
62            }
63
64            ans[i] = node.bestIndex;
65        }
66
67        return ans;
68    }
69}