/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {

    if(! head || !head.next) return head;

    let dummyNode = new ListNode();
    dummyNode.next = head;

    let curr = dummyNode

    
  

    while( curr.next != null && curr.next.next != null){
        let first = curr.next;
        let second = first.next;


        // swapping of nodes
        first.next = second.next;
        second.next = first;
        curr.next = second;


        // move the node 
        curr = first;
    }


    return dummyNode.next;
    
};