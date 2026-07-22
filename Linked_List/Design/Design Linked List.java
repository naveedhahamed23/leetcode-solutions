/**
 * LeetCode 707 - Design Linked List
 *
 * Approach:
 * 1. Maintain a head pointer to the first node.
 * 2. Maintain the current size of the linked list.
 * 3. Traverse the list whenever a specific index or the tail needs to be accessed.
 * 4. Handle insertion and deletion by updating node pointers.
 *
 * Time Complexity:
 * get()           : O(n)
 * addAtHead()     : O(1)
 * addAtTail()     : O(n)
 * addAtIndex()    : O(n)
 * deleteAtIndex() : O(n)
 *
 * Space Complexity: O(1)
 */

class MyLinkedList {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at a given index
    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    // Insert at the beginning
    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    // Insert at the end
    public void addAtTail(int val) {

        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        } else {

            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        size++;
    }

    // Insert before the given index
    public void addAtIndex(int index, int val) {

        if (index > size) {
            return;
        }

        if (index <= 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Delete node at the given index
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {

            ListNode temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        size--;
    }
}
