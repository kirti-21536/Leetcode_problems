// Last updated: 1/30/2026, 12:26:10 PM
class Solution {
    public int largestVariance(String s) {
        int ans = 0;
        int[] total = new int[26];

        for (char c : s.toCharArray()) {
            total[c - 'a']++;
        }
        for (int a = 0; a < 26; a++) {
            for (int b = 0; b < 26; b++) {
                if (a == b || total[a] == 0 || total[b] == 0) continue;

                int curr = 0;
                int remainB = total[b];
                boolean seenB = false;

                for (char ch : s.toCharArray()) {
                    if (ch - 'a' == a) curr++;
                    if (ch - 'a' == b) {
                        curr--;
                        remainB--;
                        seenB = true;
                    }

                    if (seenB)
                        ans = Math.max(ans, curr);

                    if (curr < 0 && remainB > 0) {
                        curr = 0;
                        seenB = false;
                    }
                }
            }
        }
        return ans;
    }
}
