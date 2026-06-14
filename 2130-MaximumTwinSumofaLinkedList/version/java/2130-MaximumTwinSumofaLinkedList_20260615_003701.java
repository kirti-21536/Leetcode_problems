// Last updated: 6/15/2026, 12:37:01 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int pairSum(ListNode head) {
13         ListNode slow = head;
14        ListNode fast = head;
15
16        // Step 1: Find middle
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        // Step 2: Reverse second half
23        ListNode prev = null;
24        while (slow != null) {
25            ListNode next = slow.next;
26            slow.next = prev;
27            prev = slow;
28            slow = next;
29        }
30
31        // Step 3: Find max twin sum
32        int maxSum = 0;
33        ListNode first = head;
34        ListNode second = prev;
35
36        while (second != null) {
37            maxSum = Math.max(maxSum, first.val + second.val);
38            first = first.next;
39            second = second.next;
40        }
41        return maxSum;
42        
43    }
44}