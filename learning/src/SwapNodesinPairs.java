public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        // Call swap function
        ListNode result = swapPairs(head);

        // Print result
        printList(result);
    }

    private static void printList(ListNode result) {
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode nextNode = head.next;
        head.next = swapPairs(nextNode.next);
        nextNode.next = head;

        return nextNode;
    }
}

// Proper ListNode class
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
