package util;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 二叉树类
 * @date 2023/2/3 16:52:09
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val,TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
