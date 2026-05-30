// Last updated: 5/30/2026, 3:24:20 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode curr = dummy;
15
16        int carry = 0;
17
18        while (l1 != null || l2 != null || carry != 0) {
19            int x = (l1 != null) ? l1.val : 0;
20            int y = (l2 != null) ? l2.val : 0;
21
22            int sum = x + y + carry;
23            carry = sum / 10;
24
25            curr.next = new ListNode(sum % 10);
26            curr = curr.next;
27
28            if (l1 != null) l1 = l1.next;
29            if (l2 != null) l2 = l2.next;
30        }
31
32        return dummy.next;
33    }
34}