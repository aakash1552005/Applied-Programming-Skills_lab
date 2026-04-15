class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // save next
            curr.next = prev;              // reverse link
            prev = curr;                   // move prev
            curr = nextNode;               // move curr
        }

        return prev;
    }
}
