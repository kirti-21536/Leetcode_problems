// Last updated: 3/30/2026, 1:49:43 PM
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n = s1.length();
4
5        List<Character> even1 = new ArrayList<>();
6        List<Character> odd1 = new ArrayList<>();
7        List<Character> even2 = new ArrayList<>();
8        List<Character> odd2 = new ArrayList<>();
9
10        for (int i = 0; i < n; i++) {
11            if (i % 2 == 0) {
12                even1.add(s1.charAt(i));
13                even2.add(s2.charAt(i));
14            } else {
15                odd1.add(s1.charAt(i));
16                odd2.add(s2.charAt(i));
17            }
18        }
19
20        Collections.sort(even1);
21        Collections.sort(even2);
22        Collections.sort(odd1);
23        Collections.sort(odd2);
24
25        return even1.equals(even2) && odd1.equals(odd2);
26    }
27}