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
    public int sizeLL(ListNode head){
        ListNode temp = head;
        int cnt = 0 ;
        while(temp!= null){
            cnt++;
            temp = temp.next;
            
        }
       
        return cnt ;
    }
    public ListNode reverseLL(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next= pre;
            pre = curr;
            curr = temp;
        }
        return pre ;
    }
    public int[] nextLargerNodes(ListNode head) {
       int size = sizeLL(head);
       int[] arr = new int[size];
        ListNode nHead = reverseLL(head);
       Stack<Integer> st = new Stack<>(); 
       st.push(nHead.val);
       ListNode curr = nHead.next;
       int ptr = size-2;
       while(ptr>=0){
        int ele = curr.val;
        curr = curr.next ;
        while(st.size()> 0 && st.peek()<= ele){
            st.pop();

        }
        if(st.size()==0){
            arr[ptr] = 0;
        }else {
            arr[ptr] = st.peek();
        }
        st.push(ele);
        ptr--;
       }
       return arr;
    }
}