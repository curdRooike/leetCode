package week20;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 101. 对称二叉树
 * @date 2023/2/3 16:53:02
 */
public class Test1_1 {
    public static void main(String[] args) {

    }

    /**
     * 是对称
     *
     * @param root 根
     * @return boolean
     */
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
