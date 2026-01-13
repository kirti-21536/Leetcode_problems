// Last updated: 1/13/2026, 11:12:06 AM
import java.util.*;

class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {

        Set<Integer> ban = new HashSet<>();
        for (int f : forbidden) ban.add(f);

        boolean[][] vis = new boolean[6001][2];
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0});
        vis[0][0] = true;

        int step = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.poll();
                int pos = cur[0];
                int back = cur[1];

                if (pos == x) return step;

                int f = pos + a;
                if (f < 6001 && !ban.contains(f) && !vis[f][0]) {
                    vis[f][0] = true;
                    q.add(new int[]{f, 0});
                }

                int bck = pos - b;
                if (back == 0 && bck >= 0 && !ban.contains(bck) && !vis[bck][1]) {
                    vis[bck][1] = true;
                    q.add(new int[]{bck, 1});
                }
            }
            step++;
        }
        return -1;
    }
}
