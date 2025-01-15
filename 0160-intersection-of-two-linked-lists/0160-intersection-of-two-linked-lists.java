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

    int getLength(ListNode temp){
        ListNode temp1 = temp;
        int count=0;
        while(temp1!=null){
            temp1=temp1.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null) return null;
       
    //    checking the lenght of the List
    int lengthA= getLength(headA);
    int lengthB = getLength(headB);

    // align both the list to the same level
    while(lengthA > lengthB){
     headA=headA.next;
     lengthA--;
    }

    while(lengthA < lengthB){
     headB=headB.next;
     lengthB--;
    }

    while(headA != null){
        if(headA == headB){
            return headA;
        }
        headA=headA.next;
        headB=headB.next;

    }

    return null;




    }
}