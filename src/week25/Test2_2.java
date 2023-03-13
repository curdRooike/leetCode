package week25;

import util.ListNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 反转链表
 * @date 2023/3/11 00:40:47
 */
public class Test2_2 {
    public ListNode reverseList(ListNode head) {
        ListNode p1 = null;
        ListNode p2 = head;
        while (p2 != null) {
            ListNode next = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = next;
        }
        return p1;
    }
  /*  public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
*/

}
