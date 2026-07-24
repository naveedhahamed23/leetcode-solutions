/**
 * LeetCode 160 - Intersection of Two Linked Lists
 *
 * Approach:
 * 1. Use two pointers starting from the heads of both lists.
 * 2. When a pointer reaches the end of its list, redirect it to the head of the other list.
 * 3. Both pointers will traverse the same total distance.
 * 4. If an intersection exists, they meet at the intersection node.
 *    Otherwise, both become null.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }
}
