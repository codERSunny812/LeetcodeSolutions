/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {

    if(head == null) return false;

    if(head.next == null ) return true

    let curr = head;
    const arr = [];


    while(curr != null){
        arr.push(curr.val);
        curr = curr.next;
    }

    //checking the array 
    let i=0;
    let j = arr.length -1;

    while(i<j){

        if(arr[i] != arr[j]){
            return false;
        }

        i++;
        j--;
    

    }

    return true;



    
};