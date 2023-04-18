package week29;

import util.TreeNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1026. 节点与其祖先之间的最大差值
 * @date 2023/4/18 11:22:27
 */
public class Test7 {
    private int ans;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }

    /**
     * dfs
     *
     * @param node 节点
     * @param mn   锰
     * @param mx   mx
     */
    private void dfs(TreeNode node, int mn, int mx) {
        if (node == null) {
            ans = Math.max(ans, mx - mn);
            return;
        }
        mn = Math.min(mn, node.val);
        mx = Math.max(mx, node.val);
        dfs(node.left, mn, mx);
        dfs(node.right, mn, mx);
    }
}
