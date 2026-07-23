/**
 * LeetCode 19 - Remove Nth Node From End of List
 *
 * Approach:
 * 1. Create a dummy node pointing to the head.
 * 2. Place both slow and fast pointers at the dummy node.
 * 3. Move the fast pointer n steps ahead.
 * 4. Move both pointers together until fast reaches the last node.
 * 5. Slow will be just before the node to delete.
 * 6. Skip the target node and return dummy.next.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers together
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}
