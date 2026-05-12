// Last updated: 5/12/2026, 3:21:07 PM
1class Solution {
2    public int minimumEffort(int[][] tasks) {
3
4        Arrays.sort(tasks, (a, b) ->
5            (b[1] - b[0]) - (a[1] - a[0])
6        );
7
8        int initialEnergy = 0;
9        int currentEnergy = 0;
10
11        for (int[] task : tasks) {
12            int actual = task[0];
13            int minimum = task[1];
14
15            if (currentEnergy < minimum) {
16                initialEnergy += (minimum - currentEnergy);
17                currentEnergy = minimum;
18            }
19            currentEnergy -= actual;
20        }
21        return initialEnergy;
22    }
23}