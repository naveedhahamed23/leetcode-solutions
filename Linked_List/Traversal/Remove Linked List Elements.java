/**
 * LeetCode 203 - Remove Linked List Elements
 *
 * Problem:
 * Remove all nodes from the linked list whose value
 * is equal to the given value.
 *
 * Approach:
 * 1. Create a dummy node pointing to the head.
 * 2. Traverse the list using a pointer.
 * 3. If the next node contains the target value,
 *    skip it by changing the next pointer.
 * 4. Otherwise, move to the next node.
 * 5. Return dummy.next as the new head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode temp = dummy;

        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {

                temp.next = temp.next.next;

            } else {

                temp = temp.next;
            }
        }

        return dummy.next;
    }
}
