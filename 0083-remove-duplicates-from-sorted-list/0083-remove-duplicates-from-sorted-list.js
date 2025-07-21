var deleteDuplicates = function(head) {
    let curr = head;

    while (curr && curr.next) {
        if (curr.val === curr.next.val) {
            // Skip the next duplicate node
            curr.next = curr.next.next;
        } else {
            // Move to next node if no duplicate
            curr = curr.next;
        }
    }

    return head;
};
