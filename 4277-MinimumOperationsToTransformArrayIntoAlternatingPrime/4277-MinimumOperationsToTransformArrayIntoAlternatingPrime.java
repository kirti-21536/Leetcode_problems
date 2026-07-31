// Last updated: 8/1/2026, 12:01:16 AM
class Solution {
    public int minOperations(int[] nums) {
        int ops = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i % 2 == 0) {
                if (!isPrime(num)) {
                    int next = nextPrime(num);
                    ops += (next - num);
                }
            } else {
                if (isPrime(num)) {
                    int next = nextNonPrime(num);
                    ops += (next - num);
                }
            }
        }
        return ops;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
   public int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    public int nextNonPrime(int n) {
        while (isPrime(n)) {
            n++;
        }
        return n;
    }
        
    }