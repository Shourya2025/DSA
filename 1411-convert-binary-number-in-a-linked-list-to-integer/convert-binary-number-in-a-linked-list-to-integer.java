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
    public int getDecimalValue(ListNode head) {
        StringBuilder sm = new StringBuilder();
        ListNode temp = head;
        while(temp!= null){
            sm.append(temp.val);
            temp = temp.next;

        }
        
        String s = sm.toString();
        int val = Integer.parseInt(s ,2);
       return val;
        
            
        }
    
    

    }
