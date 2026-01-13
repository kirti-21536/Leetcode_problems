// Last updated: 1/13/2026, 11:14:14 AM
class Solution {
    public String makeLargestSpecial(String s) {
        List<String> parts = new ArrayList<>();
        int count = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;

            if (count==0) {
                String inner = s.substring(start + 1, i);
                parts.add("1" + makeLargestSpecial(inner) + "0");
                start = i + 1;
            }
        }
        parts.sort(Collections.reverseOrder());
        StringBuilder res = new StringBuilder();
        for (String p : parts) res.append(p);
        return res.toString();
    }
}
