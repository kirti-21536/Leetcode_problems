// Last updated: 4/1/2026, 11:26:08 AM
1class Solution {
2    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
3
4        int n = positions.length;
5        
6        // store (pos, health, direction, index)
7        int[][] robots = new int[n][4];
8        
9        for (int i = 0; i < n; i++) {
10            robots[i][0] = positions[i];
11            robots[i][1] = healths[i];
12            robots[i][2] = directions.charAt(i); // store as int
13            robots[i][3] = i; // original index
14        }
15
16        Arrays.sort(robots, (a, b) -> a[0] - b[0]);
17
18        Stack<int[]> st = new Stack<>();
19
20        for (int[] robot : robots) {
21
22            if (robot[2] == 'R') {
23                st.push(robot);
24            } else {
25                // direction == 'L'
26                while (!st.isEmpty() && st.peek()[2] == 'R') {
27
28                    if (st.peek()[1] < robot[1]) {
29                        st.pop();
30                        robot[1]--;
31                    } 
32                    else if (st.peek()[1] > robot[1]) {
33                        st.peek()[1]--;
34                        robot[1] = 0;
35                        break;
36                    } 
37                    else {
38                        st.pop();
39                        robot[1] = 0;
40                        break;
41                    }
42                }
43
44                if (robot[1] > 0) {
45                    st.push(robot);
46                }
47            }
48        }
49
50        // collect survivors
51        List<int[]> survivors = new ArrayList<>(st);
52        survivors.sort((a, b) -> a[3] - b[3]); // original order
53
54        List<Integer> ans = new ArrayList<>();
55        for (int[] r : survivors) {
56            ans.add(r[1]);
57        }
58
59        return ans;
60    }
61}