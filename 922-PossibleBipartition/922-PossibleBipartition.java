// Last updated: 1/13/2026, 11:13:59 AM
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int[] d : dislikes) {
            graph[d[0]].add(d[1]);
            graph[d[1]].add(d[0]);
        }
        // 0 = uncolored
        //1 = group A
        //-1 = group B
        int[] color = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (color[i] != 0) continue;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 1;

            while (!q.isEmpty()) {
                int node = q.poll();
                for (int nbr : graph[node]) {
                    if (color[nbr] == 0) {
                        color[nbr] = -color[node];
                        q.add(nbr);
                    } 
                    else if (color[nbr] == color[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}