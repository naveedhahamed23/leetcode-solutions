/**
 * LeetCode 83 - Remove Duplicates from Sorted List
 *
 * Problem:
 * Given the head of a sorted linked list,
 * delete all duplicates such that
 * each element appears only once.
 *
 * Return the linked list sorted as well.
 *
 * Approach:
 * 1. Traverse the linked list using a pointer
 * 2. Compare current node with next node
 * 3. If values are equal:
 *      skip duplicate node
 * 4. Otherwise:
 *      move pointer forward
 *
 * Since the list is sorted,
 * duplicates always appear adjacent.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode() {}
 *
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode deleteDuplicates(
            ListNode head
    ) {

        // Empty list or single node
        if (head == null
                ||
            head.next == null) {

            return head;
        }

        ListNode current = head;

        // Traverse linked list
        while (current != null
                &&
               current.next != null) {

            // Duplicate found
            if (current.val
                    ==
                current.next.val) {

                current.next =
                        current.next.next;
            }

            // Move forward
            else {

                current = current.next;
            }
        }

        return head;
    }
}
