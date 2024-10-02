// Definition for singly-linked list node.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class FindMiddleLinkedListNode {

    // Method to find the middle of the linked list
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Move 'fast' by 2 steps and 'slow' by 1 step each time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' will be pointing to the middle node
        return slow;
    }

    // Method to print the linked list (for testing purposes)
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the middleNode method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        solution.printList(head);

        // Finding the middle node
        ListNode middle = solution.middleNode(head);

        System.out.println("Middle node:");
        solution.printList(middle);
    }
}
