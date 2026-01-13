// Last updated: 1/13/2026, 11:15:04 AM
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int prev = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!st.isEmpty()) {
                    res[st.peek()] += time - prev;
                }
                st.push(id);
                prev = time;
            } 
            else {
                res[st.peek()] += time - prev + 1;
                st.pop();
                prev= time + 1;
            }
        }

        return res;
    }
}
