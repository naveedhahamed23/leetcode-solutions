/**
 * LeetCode 237 - Delete Node in a Linked List
 *
 * Problem:
 * You are given a reference to a node in a singly linked list.
 * Delete the given node without access to the head of the list.
 *
 * Approach:
 * 1. Copy the value of the next node into the current node.
 * 2. Skip the next node by updating the current node's next pointer.
 * 3. This effectively removes the next node, making it appear as though
 *    the given node has been deleted.
 *
 * Note:
 * The given node is guaranteed not to be the tail node.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
