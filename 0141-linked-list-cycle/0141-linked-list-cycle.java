/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
// check for the condition in which the LL has 0 or 1 element
        if(head == null || head.next == null){
            return false;
        }

        ListNode node1 = head;
        ListNode node2 = head;
        while(node2 != null && node2.next != null){
            node1 = node1.next; //move one step 
            node2= node2.next.next; //move two step 
            if(node1 == node2){
                return true;
            }
        }


    return false;


    }
}