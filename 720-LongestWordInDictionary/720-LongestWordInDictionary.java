// Last updated: 1/13/2026, 11:14:25 AM
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String ans = "";

        for (String w : words) {
            if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
                set.add(w);
                if (w.length() > ans.length()) {
                    ans = w;
                }
            }
        }
        return ans;
    }
}
