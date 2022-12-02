package week12;


import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 94. 二叉树的中序遍历(dfs)
 * @date 2022/11/21 08:54:16
 */
public class Test1 {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
