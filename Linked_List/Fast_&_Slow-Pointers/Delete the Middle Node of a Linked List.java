/**
 * LeetCode 2095 - Delete the Middle Node of a Linked List
 *
 * Approach:
 * 1. Handle edge cases (empty list or single node).
 * 2. Use slow and fast pointers.
 * 3. Slow stops at the node before the middle.
 * 4. Delete the middle node by skipping it.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
