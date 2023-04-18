package week29;

import util.ListNode;
import util.SoutUtil;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1019. 链表中的下一个更大节点
 * @date 2023/4/10 09:07:30
 */
public class Test2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        System.out.println(Arrays.toString(new Test2()
                .nextLargerNodes(listNode)));
    }
    /*public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while (head != null) {
            if (head.next != null){
                ListNode p = head.next;
                while (p != null){
                    if (p.val > head.val) {
                        arr.add(p.val);
                        break;
                    }
                    p = p.next;
                }
                if (p == null) {
                    arr.add(0);
                }
            }
            head = head.next;
        }
        arr.add(0);
        return arr.stream().mapToInt(ie -> ie).toArray();
    }暴力*/
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        Deque<int[]> stack = new ArrayDeque<>();
        ListNode cur = head;
        int idx = -1;
        while (cur != null) {
            ++idx;
            ans.add(0);
            while (!stack.isEmpty() && stack.peek()[0] < cur.val) {
               // System.out.println(stack.peek()[0]);
                ans.set(stack.pop()[1], cur.val);
                System.out.println(ans);
            }
            stack.push(new int[]{cur.val, idx});
            for (int[] ints : stack) {
                SoutUtil.ArrayOut(ints);
            }
            System.out.println();
            cur = cur.next;
        }
        return ans.stream().mapToInt(ie -> ie).toArray();
    }

}
