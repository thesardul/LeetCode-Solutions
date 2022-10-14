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
        if(head == null) return 0;
        if(head.next == null) return head.val;
        StringBuilder str = new StringBuilder();
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        System.out.println(str.toString());
        return Integer.parseInt(str.toString(),2);
        
    }
}