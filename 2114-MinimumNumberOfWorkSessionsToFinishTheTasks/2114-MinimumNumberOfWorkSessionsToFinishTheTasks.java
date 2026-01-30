// Last updated: 1/30/2026, 12:26:21 PM
class Solution {
    int ans;

    public int minSessions(int[] tasks, int sessionTime) {
        Arrays.sort(tasks);
        reverse(tasks);              // largest first
        ans = tasks.length;

        int[] sessions = new int[tasks.length];
        dfs(0, tasks, sessionTime, sessions, 0);

        return ans;
    }

    void dfs(int idx, int[] tasks, int sessionTime, int[] sessions, int used) {
        if (used >= ans) return;

        if (idx == tasks.length) {
            ans = Math.min(ans, used);
            return;
        }

        for (int i = 0; i < used; i++) {
            if (sessions[i] + tasks[idx] <= sessionTime) {
                sessions[i] += tasks[idx];
                dfs(idx + 1, tasks, sessionTime, sessions, used);
                sessions[i] -= tasks[idx];
            }
        }

        // start new session
        sessions[used] = tasks[idx];
        dfs(idx + 1, tasks, sessionTime, sessions, used + 1);
        sessions[used] = 0;
    }

    void reverse(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}
