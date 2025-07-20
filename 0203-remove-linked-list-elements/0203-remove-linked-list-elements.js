/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {

    if(!head) return null;

    // if(head.val == val) {
    //     head = head.next;
    // }

    let curr = head;
    let prev =null;

    while(curr != null){

        if(curr == head && curr.val == val){
            head= head.next;
            curr = head;
            
        } else if(curr.val == val){
        let temp = curr.next;
            prev.next = curr.next;
            curr= temp;
        }else{
            prev = curr;
            curr=curr.next;
        }
    }
    return head;
};