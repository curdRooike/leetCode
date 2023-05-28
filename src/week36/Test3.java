package week36;

import util.TreeNode;

import java.util.Objects;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1080. 根到叶路径上的不足节点
 * @date 2023/5/22 09:18:45
 */
public class Test3 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(-9);
        node2.right = node4;
        node2.left = node5;
        System.out.println(new Test3().sufficientSubset(node1, 1));
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        limit -= root.val;
        if (root.left == null && root.right == null)
            return limit > 0 ? null : root;
        if (root.left != null)
            root.left = sufficientSubset(root.left, limit);
        if (root.right != null)
            root.right = sufficientSubset(root.right, limit);
        return root.left == null && root.right == null ? null : root;
    }
}
