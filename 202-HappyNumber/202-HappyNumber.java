// Last updated: 8/13/2025, 11:25:48 PM
class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;

    do {
        s = sum_sq(s); 
        f = sum_sq(sum_sq(f));
    } while (s!= f);

    return s == 1; 
}

private int sum_sq(int num) {
    int sum = 0;
    while (num > 0) {
        int r = num % 10;
        sum += r * r;
        num /= 10;
    }
    return sum;

    }
}