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
    // int sizeLL(ListNode head){
    //     ListNode dummy = head;
    //     int cnt = 0 ;
    //     while(dummy!= null){
    //         cnt++;
    //         dummy = dummy.next;
    //     }
    //     return cnt;


    // }
    public ListNode deleteMiddle(ListNode head) {
    //     int cnt = sizeLL(head);
    //     int len = 0 ;
    //     if(cnt%2 == 0){
    //         len = Math.abs(cnt/2)+1;

    //     }
    //     else {
    //         len = Math.abs(cnt/2);
    //     }
    //     while(len!=0){
            
    //     }
    // }

   if(head.next == null){
    return null;
   }
   ListNode fast = head;
   ListNode slow = head;ListNode pre = slow;
   while(fast != null&&fast.next != null){
    fast = fast.next.next;
    pre = slow;
    slow = slow.next;
   }
   pre.next = pre.next.next;
   return head;

    }


}