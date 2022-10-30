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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode currA = headA;
        ListNode currB = headB;
        
        while(currA!=null && currB !=null){
            currA = currA.next;
            currB = currB.next;
            
        }
        if(currA == null){
            currA = headB;
            while(currB!=null){
                currA = currA.next;
                currB = currB.next;
            }
            currB = headA;
        }
        if(currB == null){
            currB = headA;
            while(currA!=null){
                currA = currA.next;
                currB = currB.next;
            }
            currA = headB;
        }
        while(currA !=currB){
                currA = currA.next;
                currB = currB.next;
            }
        return currA;
    }
}