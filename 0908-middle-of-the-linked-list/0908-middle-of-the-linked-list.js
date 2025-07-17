var middleNode = function(head) {
    let cnt = 0;
    let curr = head;

    // Count all nodes correctly
    while (curr !== null) {
        cnt++;
        curr = curr.next;
    }

    // Now move cnt/2 steps to reach middle
    curr = head;
    for (let i = 0; i < Math.floor(cnt / 2); i++) {
        curr = curr.next;
    }

    return curr;
};
