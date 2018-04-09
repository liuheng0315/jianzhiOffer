package offerLearning;

/**
 * Created by root on 2018/3/17.
 */
public class BinaryTreeDepth {
    public static void main(String[] args) {

    }
    public static int treeDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftDepth=treeDepth(root.left);
        int rightDepth=treeDepth(root.right);
        return (leftDepth>rightDepth)?(leftDepth+1):(rightDepth+1);
    }
    class TreeNode {
                int val = 0;
                TreeNode left = null;
                TreeNode right = null;

                public TreeNode(int val) {
                    this.val = val;

        }
    }
}
