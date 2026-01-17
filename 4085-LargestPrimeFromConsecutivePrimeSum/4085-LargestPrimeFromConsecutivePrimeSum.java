// Last updated: 1/18/2026, 2:26:59 AM
class Solution {
    public int largestPrime(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int sum = 0, ans = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i, primes)) {
                primes.add(i);
                sum += i;
                if (sum > n) break;
                if (isPrime(sum, primes)) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
    
    public boolean isPrime(int x, ArrayList<Integer> primes) {
        if (x < 2) return false;
        for (int p : primes) {
            if (p * p > x) break;
            if (x % p == 0) return false;
        }
        return true;
    }
}
