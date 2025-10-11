// Last updated: 10/12/2025, 12:14:35 AM
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++; // customer pays exact
            } else if (bill == 10) {
                if (five == 0) return false; // can't give $5 change
                five--;
                ten++;
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false; // can't give change
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] bills1 = {5,5,5,10,20};
        int[] bills2 = {5,5,10,10,20};

        System.out.println(sol.lemonadeChange(bills1)); // true
        System.out.println(sol.lemonadeChange(bills2)); // false
    }
}
