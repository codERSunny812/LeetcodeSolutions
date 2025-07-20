/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {

    if((!head || !head.next) && n < 2 ) return null;

    let length = 0;
    let curr1 = head;

    while(curr1 != null){
        length++;
        curr1 = curr1.next;
    }

    // nth node from the end will be the 
    const  IdxFromFront = Math.floor(length - n);

    if(IdxFromFront < 1) return head.next;


    let prev = null;
    let curr2 = head;

    for(let i=0;i<IdxFromFront;i++){
        prev = curr2;
        curr2 = curr2.next;
    }

    // curr 2 is at the nth node from the end 
   
    prev.next = prev.next.next;
 
    


    return head;
    
};