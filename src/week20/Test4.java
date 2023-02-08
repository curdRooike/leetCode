package week20;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2331. 计算布尔二叉树的值
 * @date 2023/2/6 01:57:35
 */
public class Test4 {
    public static void main(String[] args) {

    }
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

    }
}
