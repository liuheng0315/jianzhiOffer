package offerLearning;

/**
 * Created by root on 2018/3/15.
 */
public class MirrorBinaryTreeNode {
    public static void main(String[] args) {

    }

    public static TreeNode mirror(TreeNode root) {
        TreeNode tmp=null;
        if (root==null){
            return null;
        }
        tmp=root.leftNode;
        root.leftNode=root.rightNode;
        root.rightNode=tmp;
        if (root != null) {
            mirror(root.leftNode);
            mirror(root.rightNode);
        }
        return root;
    }

    class TreeNode {
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
