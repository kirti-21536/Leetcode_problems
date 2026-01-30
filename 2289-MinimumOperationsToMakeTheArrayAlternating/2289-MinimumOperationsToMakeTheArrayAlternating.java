// Last updated: 1/30/2026, 12:26:16 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
            else
                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
        }

        int[] e = topTwo(even);
        int[] o = topTwo(odd);

        if (e[0] != o[0]) {
            return n - e[1] - o[1];
        } else {
            int op1 = n - e[1] - o[3];
            int op2 = n - e[3] - o[1];
            return Math.min(op1, op2);
        }
    }
    public int[] topTwo(Map<Integer, Integer> map) {
        int val1 = -1, cnt1 = 0;
        int val2 = -1, cnt2 = 0;

        for (int key : map.keySet()) {
            int cnt = map.get(key);
            if (cnt > cnt1) {
                val2 = val1; cnt2 = cnt1;
                val1 = key;  cnt1 = cnt;
            } else if (cnt > cnt2) {
                val2 = key; cnt2 = cnt;
            }
        }
        return new int[]{val1, cnt1, val2, cnt2};
    }
}
