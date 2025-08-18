/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int count(ListNode head){
        int cnt = 0;
        ListNode ptr = head;
        while(ptr!=null){
            cnt++;
            ptr = ptr.next;

        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int len1 = count(headA);
        int len2 = count(headB);
        int start = len1 - len2;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if(start > 0){
            //l1 is bigger
            while(start>0){
                ptr1 = ptr1.next;
                start--;
            }

        }
        else {
            while(start<0){
                ptr2 = ptr2.next;
                start++;
            }
        }
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }
        return ptr1;
    }
}
