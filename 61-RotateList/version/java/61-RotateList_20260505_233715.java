// Last updated: 5/5/2026, 11:37:15 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) return head;
14
15        // find length and tail
16        ListNode temp = head;
17        int len = 1;
18        while (temp.next != null) {
19            temp = temp.next;
20            len++;
21        }
22
23        //  make circular
24        temp.next = head;
25
26        //find new tail
27        k = k % len;
28        int steps = len - k;
29
30        ListNode newTail = temp;
31        while (steps-- > 0) {
32            newTail = newTail.next;
33        }
34
35        // break circle
36        ListNode newHead = newTail.next;
37        newTail.next = null;
38
39        return newHead;
40    }
41}