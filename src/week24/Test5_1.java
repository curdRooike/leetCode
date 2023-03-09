package week24;

import util.ListNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 234. 回文链表
 * @date 2023/3/7 11:59:04
 */
public class Test5_1 {
    public static void main(String[] args) {

    }
    private ListNode frontPointer;
    private boolean recursivelyCheck(ListNode currentNode) {

        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;

            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
}
