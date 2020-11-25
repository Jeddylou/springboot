/**
 * @author ：louzhengjie
 * @date ：Created in 2020/9/9 4:42 下午
 */
public class Leetcode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        System.out.println(sumNumbers(root));

    }

    /**
     * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
     * <p>
     * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
     * <p>
     * 计算从根到叶子节点生成的所有数字之和。
     * <p>
     * 说明: 叶子节点是指没有子节点的节点。
     */


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static int sum = 0;
    public static int sumNumbers(TreeNode root) {
        help(root);
        return sum;
    }

    private static void help(TreeNode root) {
        if(root == null) {
            return ;
        }
        if(root.left != null) {
            root.left.val += root.val * 10;
        }
        if(root.right != null) {
            root.right.val += root.val * 10;
        }
        if(root.left == null && root.right == null) {
            sum += root.val;
        }
        help(root.left);
        help(root.right);
    }


}
