// Definition for singly-linked list node.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLL {

    // Method to reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // Store the next node
            curr.next = prev;           // Reverse the current node's pointer
            prev = curr;                // Move 'prev' to the current node
            curr = next;                // Move to the next node
        }

        return prev;  // 'prev' becomes the new head of the reversed list
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

    // Main method to test the reverseList method
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

        // Reversing the linked list
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed list:");
        solution.printList(reversedHead);
    }
}
