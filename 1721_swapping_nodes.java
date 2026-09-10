
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        ListNode firstNode = fast;

        ListNode current = fast;
        while (current.next != null) {
            current = current.next;
            slow = slow.next;
        }

        ListNode secondNode = slow;

        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;

        return head;
    }
}