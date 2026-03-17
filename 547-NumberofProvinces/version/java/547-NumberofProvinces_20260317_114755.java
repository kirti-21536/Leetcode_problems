// Last updated: 3/17/2026, 11:47:55 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        
4        Set<String> set = new HashSet<>(wordList);
5        if(!set.contains(endWord)) return 0;
6
7        Queue<String> q = new LinkedList<>();
8        q.offer(beginWord);
9
10        int level = 1;
11
12        while(!q.isEmpty()) {
13
14            int size = q.size();
15            for(int i=0;i<size;i++) {
16                String word = q.poll();
17                char[] arr = word.toCharArray();
18                for(int j=0;j<arr.length;j++) {
19                    char original = arr[j];
20                    for(char c='a'; c<='z'; c++) {
21                        arr[j] = c;
22                        String next = new String(arr);
23
24                        if(next.equals(endWord))
25                            return level + 1;
26
27                        if(set.contains(next)) {
28                            q.offer(next);
29                            set.remove(next);
30                        }
31                    }
32
33                    arr[j] = original;
34                }
35            }
36
37            level++;
38        }
39
40        return 0;
41    }
42}