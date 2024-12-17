/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }
        if (count == k) {
            ListNode prev = null;
            ListNode next = null;
            current = head;
            count = 0;
            while (count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        }
        return head;
    }
}
