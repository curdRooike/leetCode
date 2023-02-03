package week19;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 100. 相同的树
 * @date 2023/2/2 15:07:48
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test7 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        return
                q != null
                        && p.val == q.val
                        && isSameTree(p.left, q.left)
                        && isSameTree(p.right, q.right);
    }
}
