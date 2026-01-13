// Last updated: 1/13/2026, 11:12:05 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;

        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }

        return count;

    }
}