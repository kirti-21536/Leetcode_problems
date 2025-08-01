// Last updated: 8/1/2025, 8:16:39 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode List1, ListNode List2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(List1!=null && List2!=null){
            if(List1.val<List2.val){
                dummy.next=List1;
                dummy=dummy.next;
                List1=List1.next;

            }
            else{
                dummy.next=List2;
                 dummy=dummy.next;
                List2=List2.next;
            }
        }
        if(List1==null){
            dummy.next=List2;
        }
        if(List2==null){
            dummy.next=List1;


        }
        return temp.next;
    }
}