/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1 
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    
    let dummy = new ListNode();
    let dummyCopy = dummy;

    let sum=0;
    let carry = 0;

    while(l1 || l2 || carry){
        sum = (!l1 ? 0 : l1.val) + (!l2 ? 0 :l2.val) + carry;
        carry = Math.floor(sum/10);
        digit = sum%10;

        // create a new Node of the no 
        let newNode = new ListNode(digit);
        dummy.next = newNode;
        dummy = dummy.next;

        l1 = l1 && l1.next;
        l2 = l2 && l2.next;
    }

    return dummyCopy.next;
};