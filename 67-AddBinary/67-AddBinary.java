// Last updated: 8/1/2025, 8:16:11 PM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) 
            sum += a.charAt(i--) - '0';
            if (j >= 0)
            sum += b.charAt(j--) - '0';

            result.append(sum % 2); // 0 or 1
            carry = sum / 2;        // 0 or 1
        }

        return result.reverse().toString();

                }

            }