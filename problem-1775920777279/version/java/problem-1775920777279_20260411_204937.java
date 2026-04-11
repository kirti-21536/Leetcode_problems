// Last updated: 4/11/2026, 8:49:37 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int ops = 0;
4        for (int i = 0; i < nums.length; i++) {
5            int num = nums[i];
6            if (i % 2 == 0) {
7                if (!isPrime(num)) {
8                    int next = nextPrime(num);
9                    ops += (next - num);
10                }
11            } else {
12                if (isPrime(num)) {
13                    int next = nextNonPrime(num);
14                    ops += (next - num);
15                }
16            }
17        }
18        return ops;
19    }
20
21    public boolean isPrime(int n) {
22        if (n <= 1) return false;
23        if (n == 2) return true;
24        if (n % 2 == 0) return false;
25
26        for (int i = 3; i * i <= n; i += 2) {
27            if (n % i == 0) return false;
28        }
29        return true;
30    }
31   public int nextPrime(int n) {
32        while (!isPrime(n)) {
33            n++;
34        }
35        return n;
36    }
37    public int nextNonPrime(int n) {
38        while (isPrime(n)) {
39            n++;
40        }
41        return n;
42    }
43        
44    }