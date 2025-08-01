// Last updated: 8/1/2025, 8:15:20 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        ListNode temp=node.next;
        node.next=node.next.next;
        temp.next=null;
    }
}