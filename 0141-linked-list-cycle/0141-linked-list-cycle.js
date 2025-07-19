/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function (head) {

    // let nodesSet = new Set();
    // let curr = head;


    // //base case 
    // if(!head) return false

    // while(curr){

    //      if(nodesSet.has(curr)){
    //         return true;
    //      }else{
    //         nodesSet.add(curr);
    //         curr=curr.next;
    //      }





    // }


    // return false;

    // approach - 2

   

    if(head == null || head.next == null) return false;

     let slow = head;
    let fast = head.next;


    while(slow != fast){


       if(fast == null || fast.next == null) return false;

        slow = slow.next;
        fast=fast.next.next
    }


    return true;
};