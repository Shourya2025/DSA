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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ptr = head.next;
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;

        while(ptr != null){
            if(ptr.val!= dummy.val){
                ListNode temp = new ListNode(ptr.val);
                dummy.next = ptr;
                dummy = dummy.next;
            }
            ptr = ptr.next;

        }
        dummy.next = null;
        return  ans;
    }
}