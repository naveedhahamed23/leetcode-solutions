/**
 * LeetCode 328 - Odd Even Linked List
 *
 * Problem:
 * Rearrange the linked list such that all nodes at odd
 * positions come first, followed by all nodes at even
 * positions, while preserving their relative order.
 *
 * Approach:
 * 1. Maintain two pointers:
 *      - odd : traverses odd-positioned nodes.
 *      - even: traverses even-positioned nodes.
 * 2. Save the head of the even list.
 * 3. Connect odd nodes together.
 * 4. Connect even nodes together.
 * 5. Attach the even list after the odd list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public ListNode oddEvenList(ListNode head) {

        if (head == null)
            return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
