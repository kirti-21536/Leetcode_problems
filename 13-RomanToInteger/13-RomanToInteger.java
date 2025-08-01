// Last updated: 8/1/2025, 8:16:48 PM
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                total -= current;  // subtract if smaller before larger
            } else {
                total += current;
            }
        }

        // Add the last character's value
        total += map.get(s.charAt(s.length() - 1));

        return total;
    }
        
    }
