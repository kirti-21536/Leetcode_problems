// Last updated: 8/19/2026, 1:05:04 PM
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4
5        for (int[] seat : reservedSeats) {
6            map.computeIfAbsent(seat[0], k -> new ArrayList<>()).add(seat[1]);
7        }
8
9        int groups = (n - map.size()) * 2;
10
11        for (int row : map.keySet()) {
12            List<Integer> ll = map.get(row);
13
14            boolean left = !ll.contains(2) && !ll.contains(3)
15                        && !ll.contains(4) && !ll.contains(5);
16
17            boolean middle = !ll.contains(4) && !ll.contains(5)
18                           && !ll.contains(6) && !ll.contains(7);
19
20            boolean right = !ll.contains(6) && !ll.contains(7)
21                          && !ll.contains(8) && !ll.contains(9);
22
23            if (left && right) {
24                groups += 2;
25            } else if (left || middle || right) {
26                groups += 1;
27            }
28        }
29
30        return groups;
31    }
32}