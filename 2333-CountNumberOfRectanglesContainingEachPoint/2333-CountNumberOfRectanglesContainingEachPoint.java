// Last updated: 1/30/2026, 12:26:13 PM
class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        List<Integer>[] byHeight = new ArrayList[101];
        for (int i = 1; i <= 100; i++) {
            byHeight[i] = new ArrayList<>();
        }
        for (int[] r : rectangles) {
            byHeight[r[1]].add(r[0]);
        }
        for (int i = 1; i <= 100; i++) {
            Collections.sort(byHeight[i]);
        }

        int[] ans = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int count = 0;

            for (int h = y; h <= 100; h++) {
                List<Integer> list = byHeight[h];
                if (list.isEmpty()) continue;

                int idx = lowerBound(list, x);
                count += list.size() - idx;
            }
            ans[i] = count;
        }
        return ans;
    }

    public int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) < target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
