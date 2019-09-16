/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sl = new ListNode(0);
        ListNode pointer = l1, q = l2, curr = sl;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = x + y + carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if (q != null) q = q.next;
            if (p != null) p = p.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return sl.next;
    }
}
