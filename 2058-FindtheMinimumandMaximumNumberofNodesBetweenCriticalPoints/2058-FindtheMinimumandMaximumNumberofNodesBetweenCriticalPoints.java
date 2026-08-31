// Last updated: 8/31/2026, 5:37:21 PM
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int first = -1;
14        int last = -1;
15        int min = Integer.MAX_VALUE;
16        ListNode prev = head;
17        ListNode curr = head.next;
18
19        int index = 1;
20
21        while (curr.next != null) {
22            if ((curr.val > prev.val && curr.val > curr.next.val) ||
23                (curr.val < prev.val && curr.val < curr.next.val)) {
24
25                if (first == -1) {
26                    first = index;
27                } else {
28                    min = Math.min(min, index - last);
29                }
30                last = index;
31            }
32
33            prev = curr;
34            curr = curr.next;
35            index++;
36        }
37        if (first == last) {
38            return new int[]{-1, -1};
39        }
40        int max = last - first;
41
42        return new int[]{min, max};
43        
44    }
45}