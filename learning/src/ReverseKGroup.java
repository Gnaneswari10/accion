public class ReverseKGroup {
    public static void main(String[] args) {
        ReverseKGroup reverse = new ReverseKGroup();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k =2;
        ListNode result = reverse.reverseKgroup(head,k);
        System.out.println(result);

    }
    public ListNode reverseKgroup(ListNode head, int k)
    {

            ListNode curr = head;
            int count = 0;

            while (curr != null && count < k) {
                curr = curr.next;
                count++;
            }

            if (count == k) {

                ListNode prev = reverseKgroup(curr, k);
                while (count-- > 0) {
                    ListNode temp = head.next;
                    head.next = prev;
                    prev = head;
                    head = temp;
                }
                return prev;
            }
            return head;

    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;

    }
    @Override
    public String toString() {
        return val + (next != null ? " -> " + next.toString() : " -> null");
    }
}
