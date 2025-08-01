// Last updated: 8/1/2025, 8:14:55 PM
class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int write = 0;  // Where we write the compressed characters
        int read = 0;   // Where we read the original characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times the currentChar repeats
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write its digits as characters
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // New length of the compressed array

    }
}