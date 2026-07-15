// Last updated: 7/15/2026, 11:07:16 AM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3        List<Integer> result = new ArrayList<>();
4        if (s == null || s.length() == 0 || words == null || words.length == 0) {
5            return result;
6        }
7        
8        int wordLen = words[0].length();
9        int wordCount = words.length;
10        
11        Map<String, Integer> wordMap = new HashMap<>();
12        for (String word : words) {
13            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
14        }
15        
16        for (int i = 0; i < wordLen; i++) {
17            int left = i;
18            int count = 0;
19            Map<String, Integer> seen = new HashMap<>();
20            
21            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
22                String word = s.substring(j, j + wordLen);
23                
24                if (wordMap.containsKey(word)) {
25                    seen.put(word, seen.getOrDefault(word, 0) + 1);
26                    count++;
27                    
28                    while (seen.get(word) > wordMap.get(word)) {
29                        String leftWord = s.substring(left, left + wordLen);
30                        seen.put(leftWord, seen.get(leftWord) - 1);
31                        left += wordLen;
32                        count--;
33                    }
34                    
35                    if (count == wordCount) {
36                        result.add(left);
37                        
38                        String leftWord = s.substring(left, left + wordLen);
39                        seen.put(leftWord, seen.get(leftWord) - 1);
40                        left += wordLen;
41                        count--;
42                    }
43                } else {
44                    seen.clear();
45                    count = 0;
46                    left = j + wordLen;
47                }
48            }
49        }
50        
51        return result;
52    }
53}