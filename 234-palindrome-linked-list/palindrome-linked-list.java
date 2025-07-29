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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode ptr1 = head;
        while(ptr1 != null){
            st.push(ptr1.val);
            ptr1 = ptr1.next;

        }
         ListNode ptr2 = head;
        while(ptr2 != null){
            int val1 = st.pop();
            int val2 = ptr2.val;
            if(val1 != val2 ) return false;
            ptr2 = ptr2.next;
        }
        return true;




    }
}