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

    // approach -1 

    // if(head == null) return false;

    // if(head.next == null ) return true

    // let curr = head;
    // const arr = [];


    // while(curr != null){
    //     arr.push(curr.val);
    //     curr = curr.next;
    // }

    // //checking the array 
    // let i=0;
    // let j = arr.length -1;

    // while(i<j){

    //     if(arr[i] != arr[j]){
    //         return false;
    //     }

    //     i++;
    //     j--;
    

    // }

    // return true;



    // approach -2 

 // corner cases 

 if(!head && !head.next) return false;

//  find the mid of the LL 
let length = 0;
 let curr = head;

 while(curr != null){
    length++;
    curr = curr.next;
 }

 const midOfLL = Math.floor(length/2);

 let mid=head;


  for(let i=0;i<midOfLL;i++){
    mid = mid.next;
  }


//   reverse the linked list from the mid 

let prev = null;
let curr2 = mid;


while(curr2 != null){
    let temp = curr2.next;
    curr2.next = prev;
    prev = curr2;
    curr2= temp;
}

// check for palindrome 
let firstNode = head;
let endNode = prev;

while(endNode != null){
    if(firstNode.val != endNode.val) return false;

    firstNode = firstNode.next;
    endNode = endNode.next;
}


return true;








    
};