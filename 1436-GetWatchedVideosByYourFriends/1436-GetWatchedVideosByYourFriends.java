// Last updated: 1/13/2026, 11:12:46 AM
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos,int[][] friends,
            int id,int level) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[friends.length];
        q.add(id);
        visited[id] = true;
        for (int l = 0; l < level; l++) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int person = q.poll();
                for (int fr : friends[person]) {
                    if (!visited[fr]) {
                        visited[fr] = true;
                        q.add(fr);
                    }
                }
            }
        }
        Map<String, Integer> map = new HashMap<>();
        while (!q.isEmpty()) {
            int person = q.poll();
            for (String v : watchedVideos.get(person)) {
                map.put(v, map.getOrDefault(v, 0) + 1);
            }
        }
        List<String> ans = new ArrayList<>(map.keySet());
        ans.sort((a, b) -> {
            if (map.get(a) == map.get(b))
                return a.compareTo(b);
            return map.get(a) - map.get(b); 
        });

        return ans;
    }
}
