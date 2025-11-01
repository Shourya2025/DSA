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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(-1);
        if(head == null || head.next== null){
            return head;
        }
        dummy.next = head;
        ListNode temp = head;
        while(temp!= null && temp.next!= null){
            int x = temp.val;
            int y = temp.next.val;
            ListNode nexty = new ListNode(GCD(x, y));
            nexty.next = temp.next;
            temp.next = nexty;
           temp = nexty.next;
        }
        return dummy.next;

    }
    public int GCD(int x , int y){
        while(x!=y){
            if(x>y){
                x = x-y;
            }
            else {
                y = y-x;
            }
        }
        return x ;
    }
}