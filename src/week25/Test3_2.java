package week25;

import util.TreeNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 617. 合并二叉树
 * @date 2023/3/13 18:23:48
 */
public class Test3_2 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;


    }
}
