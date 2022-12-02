package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 树类
 * @date 2022/11/21 09:01:57
 */

public class TreeNode {
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
