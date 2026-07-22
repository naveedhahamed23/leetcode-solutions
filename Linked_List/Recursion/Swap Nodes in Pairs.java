/**
 * LeetCode 24 - Swap Nodes in Pairs
 *
 * Problem:
 * Given a linked list, swap every two adjacent nodes
 * and return the new head.
 *
 * You must swap the nodes themselves,
 * not just their values.
 *
 * Approach (Recursion):
 * 1. Base case:
 *    - If the list is empty or has only one node,
 *      return it.
 * 2. Let:
 *      first = head
 *      second = head.next
 * 3. Recursively swap the remaining list.
 * 4. Connect first to the swapped remainder.
 * 5. Make second point to first.
 * 6. Return second as the new head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursive stack)
 */

class Solution {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);

        second.next = first;

        return second;
    }
}
