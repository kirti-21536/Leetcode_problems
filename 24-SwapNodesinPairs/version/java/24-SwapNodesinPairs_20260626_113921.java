// Last updated: 6/26/2026, 11:39:21 AM
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
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode curr = dummy;
17
18        while (curr.next != null && curr.next.next != null) {
19            ListNode first = curr.next;
20            ListNode second = curr.next.next;
21
22            // Swap
23            first.next = second.next;
24            second.next = first;
25            curr.next = second;
26
27            // Move to next pair
28            curr = first;
29        }
30
31        return dummy.next;
32    }
33}