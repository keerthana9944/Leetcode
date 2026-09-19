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
    public ListNode swapPairs(ListNode head) {
        ListNode dup = new ListNode(0);
        dup.next = head;

        ListNode prev = dup;

        while(prev.next!=null && prev.next.next!=null){
            ListNode first = prev.next;
            ListNode sec = first.next;

            first.next = sec.next;
            sec.next = first;
            prev.next = sec;

            prev = first;
            
        }

        return dup.next;
    }
}