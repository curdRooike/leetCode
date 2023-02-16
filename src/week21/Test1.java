package week21;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 104. 二叉树的最大深度
 * @date 2023/2/10 13:53:36
 */
public class Test1 {
    /*public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            int left = maxDepth(root.left);
            int fight = maxDepth(root.right);
            return Math.max(left,fight) + 1;
        }

    }*/
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        System.out.println(queue);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {

                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

}
