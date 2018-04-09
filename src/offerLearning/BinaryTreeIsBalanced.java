package offerLearning;

/**
 * Created by root on 2018/3/17.
 */
public class BinaryTreeIsBalanced {
    public static void main(String[] args) {

    }
    public static boolean isBalance(BinaryTreeDepth.TreeNode root){
        if (root==null){
            return true;
        }
        BinaryTreeDepth tree = new BinaryTreeDepth();
        int left=tree.treeDepth(root.left);
        int right=tree.treeDepth(root.right);
        if (Math.abs(left-right)>=1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
}
