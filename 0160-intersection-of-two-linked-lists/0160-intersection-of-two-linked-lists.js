/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    

    let node1 = headA;
    let node2 = headB;

    let newSet = new Set();

    while(node2 != null){
     newSet.add(node2);

     node2 = node2.next;
    }



    while(node1 != null){
        if(newSet.has(node1)) return node1;

        node1 = node1.next;
    }


    return null
};