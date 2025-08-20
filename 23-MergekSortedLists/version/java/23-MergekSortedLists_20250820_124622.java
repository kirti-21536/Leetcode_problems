// Last updated: 8/20/2025, 12:46:22 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        //tc of this method is O(k*n*log(k)) where k*n is total elements and log(k) is k    size of heap
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
            return o1.val-o2.val;
            }
        });
        ListNode Dummy =new ListNode();
        ListNode temp=Dummy;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode r=pq.poll();
            Dummy.next=r;
            Dummy=Dummy.next;
            if(r.next!=null){
                pq.add(r.next);
            }
        }
        return temp.next;

        
    }
}