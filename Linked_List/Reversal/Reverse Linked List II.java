/**
 * LeetCode 92 - Reverse Linked List II
 *
 * Approach:
 * 1. Create a dummy node to handle edge cases.
 * 2. Move to the node just before the left position.
 * 3. Reverse exactly (right - left + 1) nodes.
 * 4. Reconnect the reversed part with the prefix and suffix.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Edge case
        if (head == null || left == right) {
            return head;
        }

        // Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move to node before 'left'
        ListNode beforeLeft = dummy;

        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        // Start reversing
        ListNode leftNode = beforeLeft.next;
        ListNode prev = null;
        ListNode curr = leftNode;

        for (int i = 0; i <= right - left; i++) {

            ListNode nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        // Reconnect prefix and suffix
        beforeLeft.next = prev;
        leftNode.next = curr;

        return dummy.next;
    }
}
