package week20;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1145. 二叉树着色游戏
 * @date 2023/2/3 15:41:18
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Test1 {

    public static void main(String[] args) {

    }

    /**
     * btree游戏赢得移动
     *
     * @param root 根
     * @param n    n
     * @param x    x
     * @return boolean
     */
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        find(root, x);
        int leftSize = getSubtreeSize(xNode.left);
        if (leftSize >= (n + 1) / 2) {
            return true;
        }
        int rightSize = getSubtreeSize(xNode.right);
        if (rightSize >= (n + 1) / 2) {
            return true;
        }
        int remain = n - 1 - leftSize - rightSize;
        return remain >= (n + 1) / 2;
    }
    TreeNode xNode;

    public void find(TreeNode node, int x) {
        if (xNode != null || node == null) {
            return;
        }
        if (node.val == x) {
            xNode = node;
            return;
        }
        find(node.left, x);
        find(node.right, x);
    }


    public int getSubtreeSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSubtreeSize(node.left) + getSubtreeSize(node.right);
    }

}
